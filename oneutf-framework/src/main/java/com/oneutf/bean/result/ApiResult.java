package com.oneutf.bean.result;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author oneutf
 */
@Data
@Builder
public class ApiResult<T> {

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
}
