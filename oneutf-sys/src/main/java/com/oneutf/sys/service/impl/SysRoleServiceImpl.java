package com.oneutf.sys.service.impl;

import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysRoleMapper;
import com.oneutf.sys.model.entity.SysRoleDO;
import com.oneutf.sys.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @author oneutf
 */
@Service
public class SysRoleServiceImpl extends BeanServiceImpl<SysRoleMapper, SysRoleDO> implements SysRoleService {
}
