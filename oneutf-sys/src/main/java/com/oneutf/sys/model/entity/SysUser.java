package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.*;

import java.io.Serializable;

/**
 * @author oneutf
 * @desc user实体类
 */
@TableName("sys_user")
@Getter
@Setter
public class SysUser extends BeanEntity {

    private String name;

    private String password;
}
