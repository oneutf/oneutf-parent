package com.oneutf.exception;

import com.oneutf.bean.result.BeanResultCode;
import lombok.Getter;

/**
 * 自定义异常处理类
 *
 * @author oneutf
 */
@Getter
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Integer code;

    public CustomException(String msg) {
        super(msg);
        this.code = BeanResultCode.FAILURE.getCode();
    }

    public CustomException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public CustomException() {
    }
}
