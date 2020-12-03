package com.oneutf.bean.model.bean;

import com.alibaba.fastjson.JSON;

/**
 * @author oneutf
 */
public class Bean {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
