package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author oneutf
 */
@TableName("sys_role_menu_ref")
@Data
public class SysRoleMenuRef {

    private String roleId;

    private String menuId;


}
