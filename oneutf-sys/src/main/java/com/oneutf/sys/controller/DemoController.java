package com.oneutf.sys.controller;

import com.oneutf.bean.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static com.oneutf.bean.result.ApiResultUtils.success;

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

    @GetMapping("/admin")
    public String admin(){
        return "这是admin页";
    }

    @GetMapping("/user")
    public String user(){
        return "这是user页";
    }

    @GetMapping("/me")
    public Principal me(Principal principal) {
        log.info(principal.toString());
        return principal;
    }
}
