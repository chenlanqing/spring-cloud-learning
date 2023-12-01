package com.qing.fan.feign.consumer.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:13
 */
@FeignClient(value = "userService", url = "http://127.0.0.1:8080/provider")
public interface UserService {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    String getUser(@RequestParam("userId") Long userId);
}
