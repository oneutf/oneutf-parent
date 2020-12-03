package com.oneutf.bean.model.dto;

import com.oneutf.bean.model.bean.Bean;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Getter
@Setter
public class BeanDTO extends Bean {

    private String id;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private Integer version;
}
