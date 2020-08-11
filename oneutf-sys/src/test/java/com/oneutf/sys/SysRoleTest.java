package com.oneutf.sys;

import com.oneutf.AppStart;
import com.oneutf.sys.model.entity.SysRole;
import com.oneutf.sys.service.SysRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class SysRoleTest {

    @Autowired
    private SysRoleService sysRoleService;

    @Test
    public void demo(){
        SysRole sysRole = new SysRole();
        sysRole.setCode("admin");
        sysRole.setName("管理员");
        sysRoleService.save(sysRole);
    }
}
