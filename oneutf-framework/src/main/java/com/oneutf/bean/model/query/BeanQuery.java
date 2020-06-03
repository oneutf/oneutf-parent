package com.oneutf.bean.model.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BeanQuery extends PageQuery{

    private String id;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;
}
