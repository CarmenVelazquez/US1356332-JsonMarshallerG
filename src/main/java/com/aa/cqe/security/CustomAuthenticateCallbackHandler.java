package com.aa.cqe.security;

import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.AppConfigurationEntry;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.KafkaException;
import org.apache.kafka.common.security.auth.AuthenticateCallbackHandler;
import org.apache.kafka.common.security.oauthbearer.OAuthBearerToken;
import org.apache.kafka.common.security.oauthbearer.OAuthBearerTokenCallback;

import com.aa.cqe.utility.PropertyReader;
import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCredential;
import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.credentials.AppServiceMSICredentials;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;

import lombok.extern.log4j.Log4j2;


@Log4j2
public abstract class CustomAuthenticateCallbackHandler implements AuthenticateCallbackHandler {

    final static ScheduledExecutorService EXECUTOR_SERVICE = Executors.newScheduledThreadPool(1);
    
    
    private String authority;
    private String appId;
    private String appSecret;
    private ConfidentialClientApplication aadClient;
    private ClientCredentialParameters aadParameters;
    private String sbUri;
    PropertyReader prop; 
   

    @Override
    public void configure(Map<String, ?> configs, String mechanism, List<AppConfigurationEntry> jaasConfigEntries) {
        String bootstrapServer = Arrays.asList(configs.get(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG)).get(0).toString();
        bootstrapServer = bootstrapServer.replaceAll("\\[|\\]", "");
        URI uri = URI.create("https://" + bootstrapServer);
        sbUri = uri.getScheme() + "://" + uri.getHost();
        this.aadParameters = 
                ClientCredentialParameters.builder(Collections.singleton(sbUri + "/.default"))
                .build();        
    }

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback: callbacks) {
            if (callback instanceof OAuthBearerTokenCallback) {
                try {
                    OAuthBearerToken token = getOAuthBearerToken();
                    OAuthBearerTokenCallback oauthCallback = (OAuthBearerTokenCallback) callback;
                    oauthCallback.token(token);
                } catch (InterruptedException | ExecutionException | TimeoutException | ParseException e) {
                    e.printStackTrace();
                }
            } else {
                throw new UnsupportedCallbackException(callback);
            }
        }
    }

    private OAuthBearerToken getOAuthBearerToken() throws InterruptedException, ExecutionException, TimeoutException, IOException, ParseException
    {
    	 prop = PropertyReader.getInstance();
    	 //prop.load(new FileReader("src/main/resources/config.properties"));
    	 String tenantId = prop.tenantId;
    	 String appId = prop.appId;
    	 String appSecret = prop.appSecret;
    	 String env= prop.env;
    	 
    	 String accessToken = null;
    	 Date expiresOnDate = null;
    	 
    	 String environment = env!=null? env : System.getProperty("env");
    	  //uncomment if condition to run on local 
    	 if(environment == null || environment.equalsIgnoreCase("Local") ||  environment.equalsIgnoreCase("Dev")) {
	    	 
	    	 this.authority = "https://login.microsoftonline.com/"+ tenantId ;
	         this.appId = appId;
	         this.appSecret = appSecret;
	    	if (this.aadClient == null) {
	            synchronized(this) {
	                if (this.aadClient == null) {
	                    IClientCredential credential = ClientCredentialFactory.createFromSecret(this.appSecret);
	                    this.aadClient = ConfidentialClientApplication.builder(this.appId, credential)
	                            .authority(this.authority)
	                            .build();
	                }
	            }
	            IAuthenticationResult authResult = this.aadClient.acquireToken(this.aadParameters).get();
	            accessToken = authResult.accessToken();
	       	    expiresOnDate = authResult.expiresOnDate();
	       	    log.debug("TOKEN ACQUIRED : " + accessToken + " Expiration Time : " + expiresOnDate);
	        }
	    } else {
	    	//Implement MSI
	    	final AppServiceMSICredentials appServMSICredentials = new AppServiceMSICredentials(AzureEnvironment.AZURE);
	    	accessToken = appServMSICredentials.withClientId(prop.msiClientId).getToken(sbUri);
	        final JWT jwt = JWTParser.parse(accessToken);
	        final JWTClaimsSet claims = jwt.getJWTClaimsSet();
	        expiresOnDate = claims.getExpirationTime();
	        log.debug("TOKEN ACQUIRED : " + accessToken + " Expiration Time : " + expiresOnDate);
	    }
       
       
        
        return new OAuthBearerTokenImp(accessToken,expiresOnDate);
    }

    public void close() throws KafkaException {
        // NOOP
    }
}