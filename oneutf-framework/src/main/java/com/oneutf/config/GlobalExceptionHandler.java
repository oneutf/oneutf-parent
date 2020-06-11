package com.oneutf.config;

import com.oneutf.bean.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.oneutf.bean.result.ApiResultUtils.failure;

/**
 * @author oneutf
 * @description: 全局异常拦截类
 */
@Slf4j
@RestControllerAdvice
@Configuration
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ApiResult<String> handleBaseException(Exception e) {
        log.info(e.getMessage(), e);
        return failure("未知异常");
    }
}
