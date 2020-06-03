package com.oneutf.sys;

import com.oneutf.AppStart;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class SysUserTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void demo(){
        List<SysUser> list = sysUserService.lambdaQuery().list();
        System.out.println(list);
        SysUser sysUser = new SysUser();
        sysUser.setName("321");
        sysUserService.save(sysUser);
    }
}
