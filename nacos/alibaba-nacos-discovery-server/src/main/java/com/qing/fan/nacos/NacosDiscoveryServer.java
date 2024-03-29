package com.qing.fan.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2022年04月11日 12:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryServer {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryServer.class, args);
    }

    @RestController
    public class EchoController {
        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string;
        }
    }
}
