package com.oneutf.bean.result;

import com.oneutf.bean.exception.Const;

/**
 * @author oneutf
 */
public class ApiResultUtils<T> {

    public static <T> ApiResult<T> success(T data) {
        return ApiResult.<T>builder().code(ApiResultEnum.SUCCESS.getCode()).msg(ApiResultEnum.SUCCESS.getMsg()).data(data).build();
    }


    public static <T> ApiResult<T> failure(T data) {
        return ApiResult.<T>builder().code(ApiResultEnum.FAILURE.getCode()).msg(ApiResultEnum.FAILURE.getMsg()).data(data).build();
    }

}
