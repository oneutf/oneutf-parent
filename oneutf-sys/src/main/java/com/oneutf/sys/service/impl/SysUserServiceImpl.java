package com.oneutf.sys.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysUserMapper;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.sys.service.SysUserService;
import com.oneutf.util.BeanUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oneutf
 * @desc user实现类
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl extends BeanServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public PageInfo<SysUserVo> list(SysUserQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());

        List<SysUser> entityList = lambdaQuery()
                .eq(StrUtil.isNotBlank(qo.getId()), SysUser::getId, qo.getId())
                .list();
        List<SysUserVo> vos = BeanUtil.voTransfer(entityList, SysUserVo.class);
        return new PageInfo<>(vos);
    }

    @Override
    public boolean save(SysUserDto dto) {
        return this.save(BeanUtil.copyProperties(dto, SysUser.class));
    }

    @Override
    public boolean update(SysUserDto dto) {
        SysUser entity = BeanUtil.copyProperties(dto, SysUser.class);
        return this.updateById(entity);
    }

    @Override
    public boolean delete(String id) {
        return this.removeById(id);
    }

}
