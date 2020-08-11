package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author oneutf
 */
@TableName("sys_menu")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SysMenu extends BeanEntity {

    private String code;

    private String name;

    private String url;

    private String pid;
}
