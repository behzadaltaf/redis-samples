package com.behzad.config;


import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Created by Behzad Altaf
 */
public class ApplicationConfig {

    private ApplicationConfig() {
    }

    private static Configuration getConfiguration() {
        Configuration configs = null;
        try {
            configs = new PropertiesConfiguration("application.properties");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
            System.err.println("Error processing default configuration.");
        }
        return configs;
    }

    public static String getRedisHosts() {
        return ApplicationConfig.getConfiguration().getString("redisHostAndPort");
    }
}
