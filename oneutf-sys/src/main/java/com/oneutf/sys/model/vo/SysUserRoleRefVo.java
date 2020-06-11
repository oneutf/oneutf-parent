package com.oneutf.sys.model.vo;

import com.oneutf.bean.model.vo.BeanVo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author oneutf
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SysUserRoleRefVo extends BeanVo {

    private String roleId;

    private String userId;

}
