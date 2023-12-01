package com.qing.fan.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 18:58
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
