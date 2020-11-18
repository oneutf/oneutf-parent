package com.oneutf.sys.service;

import com.oneutf.bean.service.BeanService;
import com.oneutf.sys.model.dto.SysRoleDto;
import com.oneutf.sys.model.entity.SysRole;

/**
 * @author oneutf
 */
public interface SysRoleService extends BeanService<SysRole> {

    /**
     * 保存角色
     * @param dto dto
     * @return boolean
     */
    boolean save(SysRoleDto dto);
}
