package com.oneutf.sys.controller;

import com.oneutf.bean.controller.BeanController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author oneutf
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class DemoController extends BeanController {

    @RequestMapping(value = "/email", method = RequestMethod.POST)
    public String email(){
        return "这是主页";
    }
}
