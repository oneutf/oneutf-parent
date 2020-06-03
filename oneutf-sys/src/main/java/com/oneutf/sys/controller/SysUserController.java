package com.oneutf.sys.controller;

import com.oneutf.bean.result.ApiResult;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author oneutf
 * @description: user控制器
 */
@RestController
@RequestMapping("sys/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("save")
    public ApiResult<String> save(SysUserDto dto) throws Exception {
        return sysUserService.save(dto);
    }

    @GetMapping("get/{id}")
    public ApiResult<SysUserVo> get(@PathVariable("id") String id) throws Exception {
        return sysUserService.get(id);
    }

    @PostMapping("update")
    public ApiResult<String> update(SysUserDto dto) throws Exception {
        return sysUserService.update(dto);
    }

    @GetMapping("delete/{id}")
    public ApiResult<String> delete(@PathVariable("id") String id) throws Exception {
        return sysUserService.delete(id);
    }
}
