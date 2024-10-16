package com.qiuwu.interceptor;

import com.qiuwu.entity.User;
import com.qiuwu.until.Constans;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 丘戊
 * @package com.qiuwu.interceptor
 * @title 登录拦截器
 * @date 27/5/2022 下午 3:32
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    //    前置增强
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute(Constans.SESSION_USER);
        if (user == null) {
            //没有登录，或者session过期，重定向到登录页面
            response.sendRedirect(request.getContextPath() + "/tologin");
            return false;
        }
        return true;
    }
}
