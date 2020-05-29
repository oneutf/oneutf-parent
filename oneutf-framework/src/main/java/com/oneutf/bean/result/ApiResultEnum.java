package com.oneutf.bean.result;

import com.oneutf.bean.exception.Const;
import lombok.Getter;

/**
 * @author oneutf
 */

@Getter
public enum ApiResultEnum {
    /**
     * 成功状态
     */
    SUCCESS(Const.RESPONSE_SUCCESS_STATUS_CODE, "成功"),
    /**
     * 系统异常
     */
    FAILURE(Const.RESPONSE_INTERNAL_FAILURE_STATUS_CODE, "系统异常"),
    /**
     * 未知异常
     */
    UNKNOWN(Const.RESPONSE_UNKNOWN_FAILURE_STATUS_CODE, "未知异常");

    private Integer code;
    private String msg;

    private ApiResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
