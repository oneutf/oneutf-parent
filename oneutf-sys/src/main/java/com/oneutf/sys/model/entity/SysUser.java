package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author oneutf
 * @description: user实体类
 */
@TableName("sys_user")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BeanEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;
}
