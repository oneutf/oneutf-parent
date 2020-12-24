package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanDO;
import lombok.*;

/**
 * @author oneutf
 * @desc user实体类
 */
@Getter
@Setter
@TableName(value = "sys_user")
public class SysUserDO extends BeanDO {

    private String name;

    private String password;
}
