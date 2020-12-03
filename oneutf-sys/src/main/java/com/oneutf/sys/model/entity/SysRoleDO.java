package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanDO;
import lombok.*;

/**
 * @author oneutf
 * @desc role实体类
 */
@Getter
@Setter
@TableName("sys_role")
public class SysRoleDO extends BeanDO {

    private String code;

    private String name;
}
