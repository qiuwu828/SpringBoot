package com.example.service;

import com.example.entity.UmsUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author hunter
 * @since 2022-05-04
 */
public interface UmsUserService extends IService<UmsUser> {
    public String login(String username, String password);
}
