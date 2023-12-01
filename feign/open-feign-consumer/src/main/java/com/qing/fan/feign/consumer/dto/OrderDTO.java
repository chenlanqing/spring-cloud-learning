package com.qing.fan.feign.consumer.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 20:23
 */
@Data
public class OrderDTO {

    private String orderId;

    private BigDecimal price;

    private String itemName;
}
