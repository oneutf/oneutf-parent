package com.oneutf.bean.model.entity;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Getter
@Setter
public class BeanEntity {

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
    private Boolean isDeleted;

    @Version
    private Integer version;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
