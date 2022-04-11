package com.qing.fan.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2022年04月11日 13:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryClientApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryClientApp.class, args);
    }

}
