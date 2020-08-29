package com.oneutf.bean.result;

/**
 * @author oneutf
 * @desc 远程调用返回接口定义
 */
public interface ResultCode {

    /**
     * 返回code
     * @return code
     */
    Integer getCode();

    /**
     * 获取message
     * @return msg
     */
    String getMessage();
}
