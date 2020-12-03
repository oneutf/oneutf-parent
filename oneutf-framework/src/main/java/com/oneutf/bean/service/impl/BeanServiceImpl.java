package com.oneutf.bean.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oneutf.bean.model.entity.BeanDO;
import com.oneutf.bean.model.mapper.BeanMapper;
import com.oneutf.bean.service.BeanService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author oneutf
 * @desc 封装类
 */
@Transactional(rollbackFor = Exception.class)
public class BeanServiceImpl<M extends BeanMapper<T>, T extends BeanDO> extends ServiceImpl<M, T> implements BeanService<T> {
}
