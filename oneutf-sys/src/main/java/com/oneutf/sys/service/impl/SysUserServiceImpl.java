package com.oneutf.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oneutf.sys.mapper.SysUserMapper;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * @author oneutf
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
