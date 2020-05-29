package com.oneutf.sys.controller;

import com.oneutf.bean.result.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * 测试
 *
 * @author oneutf
 */
@RestController
@RequestMapping
public class DemoController {

    @GetMapping("getStr")
    public ApiResult<String> getStr(){
        return success("321");
    }
}
