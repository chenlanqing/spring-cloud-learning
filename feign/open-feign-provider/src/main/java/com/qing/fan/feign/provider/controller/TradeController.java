package com.qing.fan.feign.provider.controller;

import com.qing.fan.feign.provider.annotation.Intranet;
import com.qing.fan.feign.provider.params.OrderParams;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:06
 */
@RestController
public class TradeController {

    @PostMapping("/create")
    @Intranet(app = "consumer")
    public String createOrder(@RequestBody OrderParams params) {
        params.setOrderId(UUID.randomUUID().toString());
        System.out.println(params);
        return params.getOrderId();
    }
}
