package com.oneutf.sys.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;

/**
 * @author oneutf
 * @description: user接口类
 */
public interface SysUserService extends BeanService<SysUser> {

    /**
     * 分页查询
     *
     * @param qo 条件类
     * @return PageInfo<SysUserVo>
     */
    ApiResult<PageInfo<SysUserVo>> list(SysUserQuery qo);

    /**
     * 新增用户
     *
     * @param dto 用户dto
     * @return String
     */
    ApiResult<String> save(SysUserDto dto);

    /**
     * 获取用户信息
     *
     * @param id id
     * @return SysUserVo
     */
    ApiResult<SysUserVo> get(String id);

    /**
     * 修改用户
     *
     * @param dto 用户dto
     * @return String
     */
    ApiResult<String> update(SysUserDto dto);

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return String
     */
    ApiResult<String> delete(String id);
}
