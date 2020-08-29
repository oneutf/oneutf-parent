package com.oneutf.bean.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author oneutf
 */
@Getter
@AllArgsConstructor
public enum BeanResultCode implements ResultCode {

    /**
     * 成功
     */
    SUCCESS(200, "success"),
    /**
     * 失败
     */
    FAILURE(500, "failure"),
    ;
    private final Integer code;
    private final String message;
}
