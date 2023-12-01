package com.qing.fan.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年06月20日 21:15
 */
@SpringBootApplication
@EnableFeignClients
@ConfigurationPropertiesScan
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
