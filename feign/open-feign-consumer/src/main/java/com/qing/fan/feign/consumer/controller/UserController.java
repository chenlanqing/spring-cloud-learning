package com.qing.fan.feign.consumer.controller;

import com.qing.fan.feign.consumer.facade.OrderService;
import com.qing.fan.feign.consumer.facade.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:14
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser(@RequestParam("userId") Long userId) {
        String user = userService.getUser(userId);
        System.out.println(user);
        return user;
    }
}
