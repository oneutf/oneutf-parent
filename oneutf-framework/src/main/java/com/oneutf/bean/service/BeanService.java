package com.oneutf.bean.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oneutf.bean.model.entity.BeanEntity;

/**
 * @author oneutf
 */
public interface BeanService<E extends BeanEntity> extends IService<E> {

    /**
     * 封装校验操作
     * @param e 实体类
     * @return 消息
     */
    String validate(E e);
}
