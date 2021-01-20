package com.oneutf.sys.controller;

import cn.hutool.poi.excel.ExcelUtil;
import com.oneutf.bean.controller.BaseController;
import com.oneutf.cache.util.RedisUtils;
import com.oneutf.sys.constant.enums.TestEnum;
import com.oneutf.sys.model.entity.SysUserDO;
import com.oneutf.sys.model.vo.DemoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
public class DemoController implements BaseController {

    @Autowired
    private RedisUtils redisUtils;

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
        SysUserDO sysUserDO = new SysUserDO();
        sysUserDO.setName("one");
        sysUserDO.setPassword("hanhan");
        System.out.println(sysUserDO);
        redisUtils.setCacheObject(sysUserDO.getName(), sysUserDO);
        return "success";
    }

    @GetMapping("/getDemoVo")
    public DemoVO getDemoVo() {
        DemoVO demoVo = new DemoVO();
        demoVo.setTestEnum(TestEnum.SUCCESS);
        return demoVo;
    }


}
