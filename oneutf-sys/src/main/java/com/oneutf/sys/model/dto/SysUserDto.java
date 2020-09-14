package com.oneutf.sys.model.dto;

import com.oneutf.bean.model.dto.BeanDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author oneutf
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserDto extends BeanDto{

    private String name;

    private String password;

    private List<SysRoleDto> sysRoleDtos;

}
