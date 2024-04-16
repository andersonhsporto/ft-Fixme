package com.fixme.broker.handler;

import com.fixme.common.config.CommonConfiguration;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Log4j2
@Getter
public class ConnectionHandler implements Runnable {

    private static String PROPERTIES_FILE_NAME = "broker";

    private ServerSocket serverSocket;
    private ExecutorService executorService;
    private CommonConfiguration commonConfiguration = new CommonConfiguration(PROPERTIES_FILE_NAME);

    private static Integer port;

    public ConnectionHandler() {
        this.port = commonConfiguration.getPropertiesConfiguration().getInt("port");
        this.executorService = Executors.newCachedThreadPool();

    }

    @Override
    public void run() {
        log.info("Broker Connection Handler Has Started");
    }
}
