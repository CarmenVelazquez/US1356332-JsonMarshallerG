package com.aa.cqe.security;

import java.util.Date;
import java.util.Set;

import org.apache.kafka.common.security.oauthbearer.OAuthBearerToken;

public class OAuthBearerTokenImp implements OAuthBearerToken {
    private final String token;

    private final long lifetimeMilliSec;

    public OAuthBearerTokenImp(final String token, final Date expiresOn) {
        this.token = token;
        this.lifetimeMilliSec = expiresOn.getTime();
    }

    @Override
    public String value() {
        return this.token;
    }

    @Override
    public Set<String> scope() {
        return null;
    }

    @Override
    public long lifetimeMs() {
        return this.lifetimeMilliSec;
    }

    @Override
    public String principalName() {
        return null;
    }

    @Override
    public Long startTimeMs() {
        return null;
    }
}
