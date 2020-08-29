package com.oneutf.sys.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.Result;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.sys.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.oneutf.bean.result.Result.failed;
import static com.oneutf.bean.result.Result.success;

/**
 * @author oneutf
 * @desc user控制器
 */
@RestController
@RequestMapping("sys/user")
@RequiredArgsConstructor
public class SysUserController {

    private final SysUserService sysUserService;

    @PostMapping("list")
    public Result<?> list(SysUserQuery qo) {
        return success(sysUserService.list(qo));
    }

    @PostMapping("save")
    public Result<?> save(SysUserDto dto) {
        return sysUserService.save(dto) ? success() : failed();
    }

    @GetMapping("get/{id}")
    public Result<?> get(@PathVariable("id") String id) {
        return success(sysUserService.get(id));
    }

    @PostMapping("update")
    public Result<?> update(SysUserDto dto) {
        return sysUserService.update(dto) ? success() : failed();
    }

    @GetMapping("delete/{id}")
    public Result<?> delete(@PathVariable("id") String id) {
        return sysUserService.delete(id) ? success() : failed();
    }
}
