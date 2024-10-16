package com.qiuwu.controller;


import com.qiuwu.entity.User;
import com.qiuwu.service.UserService;
import com.qiuwu.until.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(String uname, String upwd, Model model, HttpServletRequest request) {
        User user = userService.login(uname, upwd);
        if (user != null) {
            //登录成功，把用户信息存入session-cookie(session key)，重定向到后台首页（日记列表页）
            request.getSession().setAttribute(Constans.SESSION_USER, user);
            return "redirect:/note/list";
        } else {
            //登录失败，把错误信息放在model，转发到login页
            model.addAttribute("error","用户名或密码错误");
            return "/login";
        }
    }
}
