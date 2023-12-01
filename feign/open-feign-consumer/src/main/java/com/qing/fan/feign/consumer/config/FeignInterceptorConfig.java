package com.qing.fan.feign.consumer.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:12
 */
@Component
public class FeignInterceptorConfig implements RequestInterceptor {

    @Resource
    private ClientProperties clientProperties;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();

        String token = request.getHeader("token");
        System.out.println(token);

        String appKey = clientProperties.getAppKey();
        String appSecret = clientProperties.getAppSecret();

        requestTemplate.header("token", token);
    }
}
