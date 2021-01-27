package com.oneutf.sys.interceptor;

import com.oneutf.bean.service.BeanHandlerInterceptor;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * sys模块拦截器
 *
 * @author oneutf
 */
@Configuration
public class SysInterceptor implements BeanHandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(1);
        return true;
    }
}
