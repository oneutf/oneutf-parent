package com.oneutf.sys.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
     * @return Page<SysUserVo>
     * @throws Exception e
     */
    ApiResult<Page<SysUserVo>> list(SysUserQuery qo) throws Exception;

    /**
     * 新增用户
     *
     * @param dto 用户dto
     * @return String
     * @throws Exception e
     */
    ApiResult<String> save(SysUserDto dto) throws Exception;

    /**
     * 获取用户信息
     *
     * @param id id
     * @return SysUserVo
     * @throws Exception e
     */
    ApiResult<SysUserVo> get(String id) throws Exception;

    /**
     * 修改用户
     *
     * @param dto 用户dto
     * @return String
     * @throws Exception e
     */
    ApiResult<String> update(SysUserDto dto) throws Exception;

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return String
     * @throws Exception e
     */
    ApiResult<String> delete(String id) throws Exception;
}
