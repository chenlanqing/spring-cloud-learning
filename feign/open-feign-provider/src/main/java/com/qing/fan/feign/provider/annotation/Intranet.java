package com.qing.fan.feign.provider.annotation;

import java.lang.annotation.*;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年12月01日 19:46
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Intranet {

    String[] app() ;
}
