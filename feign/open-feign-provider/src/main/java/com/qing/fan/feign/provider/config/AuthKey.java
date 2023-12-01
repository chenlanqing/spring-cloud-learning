package com.qing.fan.feign.provider.config;

import lombok.Data;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 20:03
 */
@Data
public class AuthKey {

    private String appKey;

    private String appSecret;
}
