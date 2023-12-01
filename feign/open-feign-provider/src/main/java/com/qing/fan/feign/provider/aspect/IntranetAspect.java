package com.qing.fan.feign.provider.aspect;

import com.qing.fan.feign.provider.config.AuthKey;
import com.qing.fan.feign.provider.config.IntranetProperties;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 20:06
 */
@Aspect
@Component
public class IntranetAspect {

    @Resource
    private IntranetProperties intranetProperties;

    @Pointcut("@annotation(com.qing.fan.feign.provider.annotation.Intranet)")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void intranetBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String signature = request.getHeader("signature");

        Object[] args = joinPoint.getArgs();
        Map<String, AuthKey> authKeyMap = intranetProperties.getAuthKeyMap();
    }
}
