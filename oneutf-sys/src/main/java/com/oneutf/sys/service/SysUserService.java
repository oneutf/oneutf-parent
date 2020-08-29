package com.oneutf.sys.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.service.BeanService;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author oneutf
 * @desc user接口类
 * @date /rq
 */
public interface SysUserService extends BeanService<SysUser>, UserDetailsService {

    /**
     * 分页查询
     *
     * @param qo qo
     * @return page
     */
    PageInfo<SysUserVo> list(SysUserQuery qo);

    /**
     * 新增用户
     *
     * @param dto 用户dto
     * @return String
     */
    boolean save(SysUserDto dto);

    /**
     * 获取用户信息
     * @param id id
     * @return vo
     */
    SysUserVo get(String id);

    /**
     * 修改用户
     * @param dto dto
     * @return boolean
     */
    boolean update(SysUserDto dto);

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return String
     */
    boolean delete(String id);

}
