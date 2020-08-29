package com.oneutf.config;

import com.oneutf.bean.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.oneutf.bean.result.Result.failed;

/**
 * @author oneutf
 * @desc 全局异常拦截类
 */
@Slf4j
@RestControllerAdvice
@Configuration
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public Result<String> handleBaseException(Exception e) {
        log.info(e.getMessage(), e);
        return failed(e.getMessage());
    }
}
