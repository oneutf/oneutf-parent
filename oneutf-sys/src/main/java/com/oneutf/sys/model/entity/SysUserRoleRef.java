package com.oneutf.sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author oneutf
 */
@TableName("user_role_ref")
@Data
public class SysUserRoleRef{

    private String roleId;

    private String userId;

}
