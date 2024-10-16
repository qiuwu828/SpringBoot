package com.qiuwu.config;

import com.qiuwu.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 丘戊
 * @package com.qiuwu.config
 * @title 监听器
 * @date 27/5/2022 下午 3:35
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Autowired
    LoginInterceptor loginInterceptor;

    private String[] EXCLUDE_PATH = new String[]{
            "/", "/tologin", "/user/login"
    };

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                //拦截所有
                .addPathPatterns("/**")
                //放行登录
                .excludePathPatterns(EXCLUDE_PATH);
    }
}
