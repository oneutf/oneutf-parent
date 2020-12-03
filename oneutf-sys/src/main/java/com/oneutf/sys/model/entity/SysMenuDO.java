package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanDO;
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
public class SysMenuDO extends BeanDO {

    private String code;

    private String name;

    private String url;

    private String pid;
}
