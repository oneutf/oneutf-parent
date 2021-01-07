package com.oneutf.bean.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author oneutf
 */
@Getter
@RequiredArgsConstructor
public enum BeanResultCode implements ResultCode {

    /**
     * 成功
     */
    SUCCESS(200, "请求成功"),
    /**
     * 失败
     */
    FAILURE(500, "网络异常"),
    ;
    private final Integer code;
    private final String message;
}
