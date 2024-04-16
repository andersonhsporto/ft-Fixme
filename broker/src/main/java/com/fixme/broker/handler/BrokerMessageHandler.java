package com.fixme.broker.handler;

import com.fixme.broker.interfaces.MessageHandler;
import com.fixme.common.dto.MessageDTO;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BrokerMessageHandler implements MessageHandler {


    @Override
    public void sendBuyOrder(MessageDTO messageDTO) {
        log.info("Sending buy order to market: {}", messageDTO.market());
    }

    @Override
    public void sendSellOrder(MessageDTO messageDTO) {

    }

    @Override
    public void receiveMessage(String message) {

    }

    @Override
    public void loginMessage(String message) {

    }

    @Override
    public void logoutMessage(String message) {

    }
}
