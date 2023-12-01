package com.qing.fan.feign.consumer.facade;

import com.qing.fan.feign.consumer.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年06月20日 21:16
 */
@FeignClient(value = "orderService", url = "http://127.0.0.1:8080/provider")
public interface OrderService {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String createOrder(@RequestBody OrderDTO dto);
}
