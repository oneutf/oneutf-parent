package com.oneutf.bean.service;

import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Collections;
import java.util.List;

/**
 * 拦截器
 *
 * @author yf@jingruiit
 */
public interface BeanHandlerInterceptor extends HandlerInterceptor {

    /**
     * 拦截配置
     *
     * @return
     */
    default List<String> getPatterns() {
        return Collections.singletonList("/**");
    }
}
