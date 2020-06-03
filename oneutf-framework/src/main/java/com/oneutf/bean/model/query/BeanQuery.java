package com.oneutf.bean.model.query;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Data
public class BeanQuery {

    private Long id;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;
}
