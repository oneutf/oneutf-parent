package com.oneutf.sys.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.Result;
import com.oneutf.bean.result.ResultCode;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.sys.service.SysUserService;
import lombok.RequiredArgsConstructor;
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

    @GetMapping
    public Result<PageInfo<SysUserVo>> list(SysUserQuery qo) {
        return success(sysUserService.list(qo));
    }

    @PostMapping
    public Result<ResultCode> save(SysUserDto dto) {
        return sysUserService.save(dto) ? success() : failed();
    }

    @PutMapping
    public Result<SysUserVo> update(SysUserDto dto) {
        return sysUserService.update(dto) ? success() : failed();
    }

    @DeleteMapping
    public Result<SysUserVo> delete(String id) {
        return sysUserService.delete(id) ? success() : failed();
    }

}
