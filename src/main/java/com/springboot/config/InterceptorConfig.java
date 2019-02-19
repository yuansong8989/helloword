package com.springboot.config;


import com.springboot.interceptor.LoginHandlerInterceptor;
import com.springboot.interceptor.Zhuceinterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * Created by yzd on 2019/1/18.
 */
@SpringBootConfiguration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private LoginHandlerInterceptor loginHandlerInterceptor;
    @Resource
    private  Zhuceinterceptor zhuceinterceptor;


    @Override
    //登陆拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/login");
        registry.addInterceptor(zhuceinterceptor).addPathPatterns("/test");
    }


}
