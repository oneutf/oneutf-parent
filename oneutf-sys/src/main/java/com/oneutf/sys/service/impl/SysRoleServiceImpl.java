package com.oneutf.sys.service.impl;

import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysRoleMapper;
import com.oneutf.sys.model.dto.SysRoleDto;
import com.oneutf.sys.model.entity.SysRole;
import com.oneutf.sys.service.SysRoleService;
import com.oneutf.util.BeanUtil;
import org.springframework.stereotype.Service;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author oneutf
 */
@Service
public class SysRoleServiceImpl extends BeanServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public ApiResult<String> save(SysRoleDto dto) {
        SysRole sysRole = BeanUtil.copyProperties(dto, SysRole.class);
        this.save(sysRole);
        return success("保存成功");
    }
}
