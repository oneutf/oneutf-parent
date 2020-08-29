package com.oneutf.sys.service.impl;

import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysMenuMapper;
import com.oneutf.sys.model.entity.SysMenu;
import com.oneutf.sys.service.SysMenuService;
import org.springframework.stereotype.Service;

/**
 * @author oneutf
 */
@Service
public class SysMenuServiceImpl extends BeanServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {
}
