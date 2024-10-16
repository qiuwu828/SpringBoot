package com.example.controller;


import com.example.service.UmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author hunter
 * @since 2022-05-04
 */
@RestController
@RequestMapping("/umsUser")
public class UmsUserController {
    @Autowired
    private UmsUserService umsUserService;

    @PostMapping("/login")
    public String selectAll(String username, String password) {
        String login = umsUserService.login(username, password);
        if (login != null) {
            Map<String, String> map = new HashMap<String,String>(16);
            map.put("token", login);
            map.put("username", username);
            //返回身份令牌
            return "登录成功" + map;
        } else {
            return "用户名或密码错误";
        }
    }
}
