package com.oneutf.bean.result;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.UtilityClass;

/**
 * @author oneutf
 */
@Data
@Accessors(chain = true)
public class Result<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>().setCode(BeanResultCode.SUCCESS.getCode()).setData(data)
                .setMsg(BeanResultCode.SUCCESS.getMessage());
    }

    public static <T> Result<T> success(T data, String msg) {
        return new Result<T>().setCode(BeanResultCode.SUCCESS.getCode()).setData(data)
                .setMsg(msg);
    }

    public static <T> Result<T> failed() {
        return new Result<T>().setCode(BeanResultCode.FAILURE.getCode()).setMsg(BeanResultCode.FAILURE.getMessage());
    }

    public static <T> Result<T> failed(String msg) {
        return new Result<T>().setCode(BeanResultCode.FAILURE.getCode()).setMsg(msg);
    }

    public static <T> Result<T> failed(ResultCode failMsg) {
        return new Result<T>().setCode(failMsg.getCode()).setMsg(failMsg.getMessage());
    }

}
