package com.adidas.product.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "service")
@RefreshScope
public class ServiceConfigs {
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    private String userAgent;
}
