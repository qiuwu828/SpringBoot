package com.qiuwu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 丘戊
 * @package com.qiuwu.controller
 * @title 默认登录
 * @date 27/5/2022 下午 2:15
 */
@Controller
public class IndexController {
    @RequestMapping({"/", "/tologin"})
    public String index() {
        return "login";
    }
}
