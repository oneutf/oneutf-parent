package com.oneutf.sys.service.impl;

import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysMenuMapper;
import com.oneutf.sys.model.dto.SysMenuDto;
import com.oneutf.sys.model.entity.SysMenu;
import com.oneutf.sys.model.entity.SysRoleMenuRef;
import com.oneutf.sys.service.SysMenuService;
import com.oneutf.sys.service.SysRoleMenuRefService;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author oneutf
 */
@Service
public class SysMenuServiceImpl extends BeanServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Autowired
    private SysRoleMenuRefService sysRoleMenuRefService;


    @Override
    public ApiResult<List<SysMenuDto>> listRoleMenu(String roleId) {
        List<SysRoleMenuRef> sysRoleMenuRefs = sysRoleMenuRefService.lambdaQuery().eq(SysRoleMenuRef::getRoleId, roleId).list();
        List<SysMenuDto> sysMenuDtos = sysRoleMenuRefs.stream().map(sysRoleMenuRef -> {
            SysMenu sysMenu = this.getById(sysRoleMenuRef.getMenuId());
            return BeanUtil.copyProperties(sysMenu, SysMenuDto.class);
        }).collect(Collectors.toList());
        return success(sysMenuDtos);
    }
}
