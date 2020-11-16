package com.oneutf.sys.controller;

import cn.hutool.poi.excel.ExcelUtil;
import com.oneutf.bean.controller.BeanController;
import com.oneutf.cache.util.RedisUtils;
import com.oneutf.sys.model.entity.SysUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 测试
 *
 * @author oneutf
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class DemoController extends BeanController {

    private final RedisUtils redisUtils;

    private final RedisCache redisCache;

    @RequestMapping(value = "/email", method = RequestMethod.POST)
    public String email() {
        return "这是主页";
    }

    @PostMapping(value = "/file")
    public String file(MultipartFile file) throws IOException {
        ExcelUtil.readBySax(file.getInputStream(), 0, (a, b, c) -> {
            System.out.println(a + "===" + b + "===" + c);
        });
        return null;
    }

    @PostMapping(value = "/redis")
    public String redis() {
        SysUser sysUser = new SysUser();
        sysUser.setName("one");
        sysUser.setPassword("hanhan");
        redisCache.put("user", sysUser);

        return "success";
    }
}
