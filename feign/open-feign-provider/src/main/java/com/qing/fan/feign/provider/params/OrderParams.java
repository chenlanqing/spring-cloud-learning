package com.qing.fan.feign.provider.params;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 20:20
 */
@Data
public class OrderParams {

    private String orderId;

    private BigDecimal price;

    private String itemName;

}
