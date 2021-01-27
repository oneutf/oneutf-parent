package com.oneutf.config;

import com.oneutf.bean.service.BeanHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Map;

/**
 * 基础web-mvc配置
 *
 * @author oneutf
 */
@Configuration
public class BeanWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        Map<String, BeanHandlerInterceptor> interceptorMap = applicationContext.getBeansOfType(BeanHandlerInterceptor.class);
        for (BeanHandlerInterceptor interceptor : interceptorMap.values()) {
            InterceptorRegistration registration = registry.addInterceptor(interceptor);
            registration.addPathPatterns(interceptor.getPatterns());
        }
    }
}
