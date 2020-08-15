package com.oneutf.sys.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author oneutf
 */
@Slf4j
@RestController
public class DemoController {

    @GetMapping("/")
    public String email(){
        return "这是主页";
    }
}
