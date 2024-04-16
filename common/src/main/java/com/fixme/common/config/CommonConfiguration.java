package com.fixme.common.config;

import org.apache.commons.configuration.PropertiesConfiguration;

public class CommonConfiguration {

    private static final PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();

    public CommonConfiguration() {
        try {
            propertiesConfiguration.load("common.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CommonConfiguration(String fileName) {
        try {
            propertiesConfiguration.load(String.format("%s.properties", fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PropertiesConfiguration getPropertiesConfiguration() {
        return propertiesConfiguration;
    }
}
