package com.oneutf.sys.interceptor;

import cn.hutool.json.JSONUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.oneutf.bean.result.Result.failed;

/**
 * @author oneutf
 * @desc sys模块拦截器
 */
@RequiredArgsConstructor
public class SysInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        PrintWriter writer = response.getWriter();
        writer.write(JSONUtil.toJsonPrettyStr(failed()));
        return false;
    }
}
