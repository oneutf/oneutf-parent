package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author oneutf
 */
@TableName("sys_user")
@Data
public class SysUser extends BeanEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;
}
