package com.oneutf.sys.service;

import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.sys.model.dto.SysMenuDto;
import com.oneutf.sys.model.entity.SysMenu;
import com.oneutf.sys.model.entity.SysUser;

import java.util.List;

/**
 * @author oneutf
 */
public interface SysMenuService extends BeanService<SysMenu> {

    /**
     * 获取角色关联菜单
     * @param roleId 角色id
     * @return
     */
    ApiResult<List<SysMenuDto>> listRoleMenu(String roleId);
}
