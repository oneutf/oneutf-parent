package com.oneutf.util;

import com.oneutf.bean.result.BeanResultCode;
import com.oneutf.exception.CustomException;
import lombok.experimental.UtilityClass;

/**
 * 自定义-断言-工具类
 * @author oneutf
 */
@UtilityClass
public class CustomAssertUtils {

    public void defaultAssert() {
        throw new CustomException(BeanResultCode.FAILURE.getCode(), BeanResultCode.FAILURE.getMessage());
    }

    public void defaultAssert(String msg) {
        throw new CustomException(BeanResultCode.FAILURE.getCode(), msg);
    }

    public void defaultAssert(Integer code, String msg) {
        throw new CustomException(code, msg);
    }
}
