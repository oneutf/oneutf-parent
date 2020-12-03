package com.oneutf.sys.service;

import com.oneutf.bean.service.BeanService;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUserDO;

/**
 * @author oneutf
 * @desc user接口类
 * @date /rq
 */
public interface SysUserService extends BeanService<SysUserDO> {

    /**
     * 新增用户
     *
     * @param dto 用户dto
     * @return String
     */
    boolean save(SysUserDto dto);

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
