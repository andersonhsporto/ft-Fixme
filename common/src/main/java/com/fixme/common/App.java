package com.fixme.common;

import com.fixme.common.config.CommonConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CommonConfiguration  brokerConfiguration = new CommonConfiguration();

        Integer port = brokerConfiguration.getPropertiesConfiguration().getInt("port");

        System.out.println( port );
    }
}
