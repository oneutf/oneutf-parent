package com.oneutf.sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysUserMapper;
import com.oneutf.sys.model.dto.SysMenuDto;
import com.oneutf.sys.model.dto.SysRoleDto;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.dto.SysUserRoleRefDto;
import com.oneutf.sys.model.entity.SysRole;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.model.entity.SysUserRoleRef;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.sys.service.SysMenuService;
import com.oneutf.sys.service.SysRoleService;
import com.oneutf.sys.service.SysUserRoleRefService;
import com.oneutf.sys.service.SysUserService;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author oneutf
 * @description: user实现类
 */
@Service
public class SysUserServiceImpl extends BeanServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysMenuService sysMenuService;

    @Override
    public ApiResult<PageInfo<SysUserVo>> list(SysUserQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());

        List<SysUser> entityList = lambdaQuery().list();
        List<SysUserVo> vos = BeanUtil.voTransfer(entityList, SysUserVo.class);
        PageInfo<SysUserVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }

    @Override
    public ApiResult<String> save(SysUserDto dto) {
        this.save(BeanUtil.copyProperties(dto, SysUser.class));
        return success("保存成功");
    }

    @Override
    public ApiResult<SysUserVo> get(String id) {
        SysUser entity = this.getById(id);
        SysUserVo vo = BeanUtil.copyProperties(entity, SysUserVo.class);
        return success(vo);
    }

    @Override
    public ApiResult<String> update(SysUserDto dto) {
        SysUser entity = BeanUtil.copyProperties(dto, SysUser.class);
        this.updateById(entity);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
        this.removeById(id);
        return success("删除成功");
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库中搜索用户
        SysUser entity = lambdaQuery().eq(SysUser::getName, username).one();
        Assert.notNull(entity, "该用户不存在");
        SysUserDto sysUserDto = BeanUtil.copyProperties(entity, SysUserDto.class);

        // 权限赋值
        List<SysRoleDto> sysRoleDtos = sysRoleService.listUserRole(entity.getId()).getData();
        Set<SysMenuDto> menuDtos = sysRoleDtos.stream().flatMap(sysRoleDto -> {
            List<SysMenuDto> sysMenuDtos = sysMenuService.listRoleMenu(sysRoleDto.getId()).getData();
            return sysMenuDtos.stream();
        }).collect(Collectors.toSet());

        List<String> collect = menuDtos.stream().map(
                sysMenuDto -> sysMenuDto.getUrl()
        ).collect(Collectors.toList());

        sysUserDto.setAuthorities(
                AuthorityUtils.createAuthorityList(
                        menuDtos.stream().map(
                                sysMenuDto -> sysMenuDto.getUrl()
                        ).collect(Collectors.joining())
                )
        );
        return sysUserDto;
    }
}
