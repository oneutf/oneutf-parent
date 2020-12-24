package com.oneutf.sys.service.impl;

import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysUserMapper;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUserDO;
import com.oneutf.sys.service.SysUserService;
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
    public void save(SysUserDto dto) {
        SysUserDO sysUserDO = new SysUserDO();
        sysUserDO.setName(dto.getName());
        sysUserDO.setPassword(dto.getPassword());
        save(sysUserDO);
    }

    @Override
    public void update(SysUserDto dto) {
        SysUserDO sysUserDO = getById(dto.getId());
        sysUserDO.setName(dto.getName());
        sysUserDO.setPassword(dto.getName());
        updateById(sysUserDO);
    }
}
