package com.fixme.broker.interfaces;


import com.fixme.common.dto.MessageDTO;

public interface MessageHandler {
    void sendBuyOrder(MessageDTO messageDTO);

    void sendSellOrder(MessageDTO messageDTO);

    void receiveMessage(String message);

    void loginMessage(String message);

    void logoutMessage(String message);
}
