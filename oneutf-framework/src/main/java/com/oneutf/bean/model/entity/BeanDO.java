package com.oneutf.bean.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.oneutf.bean.model.bean.Bean;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Getter
@Setter
public class BeanDO extends Bean {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean isDeleted;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
