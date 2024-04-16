package com.fixme.broker;


import com.fixme.broker.handler.ConnectionHandler;
import lombok.extern.log4j.Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Log4j2
public class App
{
    public static void main( String[] args )
    {
        log.info("Broker Application Has Started");
        ConnectionHandler connectionHandler = new ConnectionHandler();

        Thread connectionHandlerThread = new Thread(connectionHandler);

        connectionHandlerThread.start();
    }
}
