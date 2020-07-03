package com.oneutf.sys.service;

import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.sys.model.dto.SysUserRoleRefDto;
import com.oneutf.sys.model.entity.SysUserRoleRef;

import java.util.List;

/**
 * @author oneutf
 */
public interface SysUserRoleRefService extends BeanService<SysUserRoleRef> {

    /**
     * 保存用户关联角色
     *
     * @param sysUserRoleRefDtos 关联dtos
     * @param userId 用户id
     * @return String
     */
    ApiResult<String> save(List<SysUserRoleRefDto> sysUserRoleRefDtos, String userId);
}
