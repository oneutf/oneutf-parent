package com.oneutf.bean.model.vo;

import com.oneutf.bean.model.bean.Bean;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Getter
@Setter
public class BeanVO extends Bean {

    private String id;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;
}
