package com.qing.fan.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2022年04月01日 15:30
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
