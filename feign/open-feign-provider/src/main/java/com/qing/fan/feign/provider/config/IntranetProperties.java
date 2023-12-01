package com.qing.fan.feign.provider.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;


/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:59
 */
@Data
@ConfigurationProperties(prefix = "intranet")
public class IntranetProperties {

    private Map<String, AuthKey> authKeyMap;
}
