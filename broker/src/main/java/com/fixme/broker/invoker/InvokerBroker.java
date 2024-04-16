//package com.fixme.broker.invoker;
//
//import com.fixme.router.dto.MessageDTO;
//
//public class InvokerBroker {
//
//    private String id;
//
//    void sendMessage(MessageDTO message) {
//        System.out.println("InvokerBroker: " + message);
//    }
//
//    // class to create a fix message
//    String generateFixHeader(MessageDTO message) {
//        // generate fix header
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append("8=FIX.4.2;");
//        stringBuilder.append("9=178;");
//        stringBuilder.append("35=D;");
//        stringBuilder.append("49=Broker;");
//        stringBuilder.append("56=Market;");
//        stringBuilder.append("34=1;");
//        stringBuilder.append("52=20210801-10:00:00;");
//        stringBuilder.append("11=1;");
//        stringBuilder.append("21=1;");
//        stringBuilder.append("55=" + message.instrument() + ";");
//        stringBuilder.append("54=1;");
//        stringBuilder.append("38=" + message.quantity() + ";");
//        stringBuilder.append("40=1;");
//        stringBuilder.append("44=" + message.price() + ";");
//        stringBuilder.append("59=0;");
//        stringBuilder.append("10=0;");
//
//
//        return "";
//    }
//}
