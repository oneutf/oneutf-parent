package com.oneutf.sys.service.impl;

import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysUserMapper;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUserDO;
import com.oneutf.sys.service.SysUserService;
import com.oneutf.util.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author oneutf
 * @desc user实现类
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl extends BeanServiceImpl<SysUserMapper, SysUserDO> implements SysUserService {

    @Override
    public boolean save(SysUserDto dto) {
        return this.save(BeanUtils.copyProperties(dto, SysUserDO.class));
    }

    @Override
    public boolean update(SysUserDto dto) {
        SysUserDO entity = BeanUtils.copyProperties(dto, SysUserDO.class);
        return this.updateById(entity);
    }

    @Override
    public boolean delete(String id) {
        return this.removeById(id);
    }

}
