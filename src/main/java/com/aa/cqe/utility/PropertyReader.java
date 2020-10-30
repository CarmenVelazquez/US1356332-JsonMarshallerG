package com.aa.cqe.utility;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
public class PropertyReader {
	
	private static String propertyName = Constants.PROPERTYFILENAME;
	public static String applicationId;
	public static String applicationName;
	public static String componentId;
	public static String tenantId;
	public static String appId;
	public static String appSecret;
	public static String env;
	public static String msiClientId;
	private static PropertyReader propertyReader = null;
	
	private PropertyReader() {
		
	}
	public static PropertyReader getInstance() throws IOException {
		if(propertyReader == null) {
		  synchronized (PropertyReader.class) {
			  propertyReader = new PropertyReader();
			  fileReader();
		  }
		}
		return propertyReader;
	}
	
	private static void fileReader() throws IOException{
		Properties prop = new Properties();
		prop.load(PropertyReader.class.getClassLoader().getResourceAsStream(propertyName));
		applicationId = prop.getProperty(Constants.CONFIG_APPLICATION_ID);
		applicationName = prop.getProperty(Constants.CONFIG_APPLICATION_NAME);
		tenantId = prop.getProperty(Constants.CONFIG_TENANT_ID);
		componentId = prop.getProperty(Constants.CONFIG_COMPONENT_ID);
		tenantId = prop.getProperty(Constants.CONFIG_TENANT_ID);
		appId = prop.getProperty(Constants.CONFIG_APP_ID);
		appSecret = prop.getProperty(Constants.CONFIG_APP_SECRET);
		env = prop.getProperty(Constants.CONFIG_ENV);
		msiClientId = prop.getProperty(Constants.CONFIG_MSI_ClientId);
	}

}
