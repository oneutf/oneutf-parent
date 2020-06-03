package com.oneutf.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start install fill ......");
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        log.info("end install fill ......");
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ......");
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
        log.info("end update fill ......");
    }
}
