package com.oneutf.sys.service.impl;

import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.sys.mapper.SysUserRoleRefMapper;
import com.oneutf.sys.model.dto.SysUserRoleRefDto;
import com.oneutf.sys.model.entity.SysUserRoleRef;
import com.oneutf.sys.service.SysUserRoleRefService;
import com.oneutf.util.BeanUtil;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author oneutf
 */
@Service
public class SysUserRoleRefServiceImpl extends BeanServiceImpl<SysUserRoleRefMapper, SysUserRoleRef> implements SysUserRoleRefService {

    @Override
    public ApiResult<String> save(List<SysUserRoleRefDto> sysUserRoleRefDtos, String userId) {
        // 删除旧数据
        this.remove(lambdaQuery().eq(SysUserRoleRef::getUserId, userId));

        // 新增数据
        this.saveBatch(BeanUtil.transfer(sysUserRoleRefDtos, SysUserRoleRef.class));

        return success("保存成功");
    }
}
