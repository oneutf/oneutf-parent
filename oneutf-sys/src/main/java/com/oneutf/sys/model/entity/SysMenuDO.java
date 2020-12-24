package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanDO;
import lombok.*;

/**
 * @author oneutf
 */
@Getter
@Setter
@TableName(value = "sys_menu")
public class SysMenuDO extends BeanDO {

    private String code;

    private String name;

    private String url;

    private String pid;
}
