package com.oneutf.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysUserMapper;
import com.oneutf.sys.model.dto.SysUserDto;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.sys.service.SysUserService;
import org.springframework.stereotype.Service;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author oneutf
 * @description: user实现类
 */
@Service
public class SysUserServiceImpl extends BeanServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public ApiResult<Page<SysUserVo>> list(SysUserQuery qo) throws Exception {

        return null;
    }

    @Override
    public ApiResult<String> save(SysUserDto dto) throws Exception {
        this.save(BeanUtil.copyProperties(dto, SysUser.class));
        return success("保存成功");
    }

    @Override
    public ApiResult<SysUserVo> get(String id) throws Exception {
        SysUser entity = this.getById(id);
        SysUserVo vo = BeanUtil.copyProperties(entity, SysUserVo.class);
        return success(vo);
    }

    @Override
    public ApiResult<String> update(SysUserDto dto) throws Exception {
        SysUser entity = BeanUtil.copyProperties(dto, SysUser.class);
        this.updateById(entity);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) throws Exception {
        this.removeById(id);
        return success("删除成功");
    }
}
