package com.fixme.common.dto;

import java.math.BigDecimal;

public record MessageDTO(
    String instrument,
    int quantity,
    BigDecimal price,
    String market
) {

    public String generateFixTextMessage() {
        StringBuilder fixMessage = new StringBuilder();

        fixMessage.append("35=D|"); // Tag 35=D indica uma nova ordem
        fixMessage.append("55=").append(instrument).append("|"); // Tag 55= representa o instrumento
        fixMessage.append("38=").append(quantity).append("|"); // Tag 38= representa a quantidade
        fixMessage.append("44=").append(price).append("|"); // Tag 44= representa o preço
        fixMessage.append("56=").append(market).append("|"); // Tag 56= representa o mercado
        return fixMessage.toString();
    }
}
