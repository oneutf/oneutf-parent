package com.oneutf.sys.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.controller.BaseController;
import com.oneutf.bean.result.Result;
import com.oneutf.bean.result.ResultCode;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.vo.SysUserVO;
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
@RequestMapping("/sys/user")
@RequiredArgsConstructor
public class SysUserController extends BaseController {

    private final SysUserService sysUserService;

    @GetMapping
    public Result<PageInfo<SysUserVO>> list() {
        return success();
    }

    @PostMapping
    public Result<ResultCode> save(@RequestBody SysUserDto dto) {
        sysUserService.save(dto);
        return success();
    }

    @PutMapping
    public Result<SysUserVO> update(@RequestBody SysUserDto dto) {
        sysUserService.update(dto);
        return success();
    }

}
