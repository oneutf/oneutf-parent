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
     * @param dto dto
     */
    void save(SysUserDto dto);

    /**
     * 修改用户
     * @param dto dto
     */
    void update(SysUserDto dto);

}
