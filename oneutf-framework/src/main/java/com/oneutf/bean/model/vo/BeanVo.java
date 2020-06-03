package com.oneutf.bean.model.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Data
public class BeanVo {

    private String id;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;
}
