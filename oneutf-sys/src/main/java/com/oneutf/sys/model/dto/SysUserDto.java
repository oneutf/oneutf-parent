package com.oneutf.sys.model.dto;

import com.oneutf.bean.model.dto.BeanDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oneutf
 */
@Getter
@Setter
public class SysUserDto extends BeanDTO {

    private String name;

    private String password;
}
