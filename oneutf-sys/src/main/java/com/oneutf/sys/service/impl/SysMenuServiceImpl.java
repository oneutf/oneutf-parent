package com.oneutf.sys.service.impl;

import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysMenuMapper;
import com.oneutf.sys.model.dto.SysMenuDto;
import com.oneutf.sys.model.entity.SysMenu;
import com.oneutf.sys.service.SysMenuService;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author oneutf
 */
@Service
public class SysMenuServiceImpl extends BeanServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {
}
