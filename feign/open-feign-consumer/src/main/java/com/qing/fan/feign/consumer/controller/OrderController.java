package com.qing.fan.feign.consumer.controller;

import com.qing.fan.feign.consumer.dto.OrderDTO;
import com.qing.fan.feign.consumer.facade.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:02
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/createOrder")
    public String createOrder() {
        OrderDTO dto = new OrderDTO();
        dto.setPrice(BigDecimal.valueOf(100));
        dto.setItemName("iPhone 13 Pro");
        return orderService.createOrder(dto);
    }
}
