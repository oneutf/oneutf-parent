package com.oneutf.bean.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oneutf.bean.model.entity.BeanEntity;
import com.oneutf.bean.model.mapper.BeanMapper;
import com.oneutf.bean.service.BeanService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author oneutf
 * @description: 封装类
 */
@Transactional(rollbackFor = Exception.class)
public class BeanServiceImpl<M extends BeanMapper<E>, E extends BeanEntity> extends ServiceImpl<M, E> implements BeanService<E> {

    @Override
    public String validate(E e) {
        return null;
    }
}
