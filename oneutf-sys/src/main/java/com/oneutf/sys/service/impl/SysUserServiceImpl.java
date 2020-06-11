package com.oneutf.sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysUserMapper;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.sys.service.SysUserService;
import com.oneutf.util.BeanUtil;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author oneutf
 * @description: user实现类
 */
@Service
public class SysUserServiceImpl extends BeanServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public ApiResult<PageInfo<SysUserVo>> list(SysUserQuery qo){
        PageHelper.startPage(qo.getPage(), qo.getLimit());

        List<SysUser> entitys = lambdaQuery().list();
        List<SysUserVo> vos = BeanUtil.voTransfer(entitys, SysUserVo.class);
        PageInfo<SysUserVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }

    @Override
    public ApiResult<String> save(SysUserDto dto){
        this.save(BeanUtil.copyProperties(dto, SysUser.class));
        return success("保存成功");
    }

    @Override
    public ApiResult<SysUserVo> get(String id) {
        SysUser entity = this.getById(id);
        SysUserVo vo = BeanUtil.copyProperties(entity, SysUserVo.class);
        return success(vo);
    }

    @Override
    public ApiResult<String> update(SysUserDto dto) {
        SysUser entity = BeanUtil.copyProperties(dto, SysUser.class);
        this.updateById(entity);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
        this.removeById(id);
        return success("删除成功");
    }
}
