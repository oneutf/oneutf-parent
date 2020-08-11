package com.oneutf.sys;

import com.oneutf.AppStart;
import com.oneutf.sys.service.SysMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class MenuTest {

    @Autowired
    private SysMenuService sysMenuService;

    @Test
    public void demo(){
//        SysMenu sysMenu = new SysMenu();
//        sysMenu.setCode("add");
//        sysMenu.setName("添加");
//        sysMenu.setUrl("/admin/add");
//        sysMenuService.save(sysMenu);
        System.out.println(sysMenuService.getById("840f2d01eadb36bf3b49be3343397d2b"));
    }
}
