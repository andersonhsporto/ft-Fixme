package com.fixme.broker.handler;

import com.fixme.broker.interfaces.MessageHandler;

public class BrokerMessageHandler implements MessageHandler {

    @Override
    public void handleMessage(String message) {
        System.out.println("Broker: " + message);
    }
}
