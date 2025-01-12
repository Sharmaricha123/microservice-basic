package com.richa.ecommerce.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderRequestDto {
    private Long id;
    private List<com.ecommerce.dto.OrderRequestItemDto> items;
    private BigDecimal totalPrice;
}

