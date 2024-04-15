package com.fixme.router.DTO;

import java.math.BigDecimal;

public record MessageDTO(
    String instrument,
    int quantity,
    BigDecimal price,
    String market
) {
}
