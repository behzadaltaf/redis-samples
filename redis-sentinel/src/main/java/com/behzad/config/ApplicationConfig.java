package com.behzad.config;


import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Created by behzad Altaf
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

    public static String getSentinal1() {
        return ApplicationConfig.getConfiguration().getString("sentinel1");
    }

    public static String getSentinal2() {
        return ApplicationConfig.getConfiguration().getString("sentinel2");
    }

    public static String getSentinal3() {
        return ApplicationConfig.getConfiguration().getString("sentinel3");
    }

    public static String getMasterName() {
        return ApplicationConfig.getConfiguration().getString("masterName");
    }

    public static String getAuth() {
        return ApplicationConfig.getConfiguration().getString("auth");
    }
}
