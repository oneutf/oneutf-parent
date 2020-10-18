package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author oneutf
 * @desc role实体类
 */
@TableName("sys_role")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SysRole extends BeanEntity {

    private String code;

    private String name;
}
