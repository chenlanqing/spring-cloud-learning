package com.qing.fan.feign.consumer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:48
 */
@Data
@ConfigurationProperties(prefix = "client")
public class ClientProperties {

    private String appKey;

    private String appSecret;
}
