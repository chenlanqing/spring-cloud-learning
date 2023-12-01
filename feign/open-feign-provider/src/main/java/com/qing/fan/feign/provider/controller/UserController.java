package com.qing.fan.feign.provider.controller;

import com.qing.fan.feign.provider.annotation.Intranet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:13
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    @Intranet(app = "consumer")
    public String getUser(@RequestParam("userId") Long userId, HttpServletRequest request) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(userId + " <==> " + uuid);
        return uuid;
    }
}
