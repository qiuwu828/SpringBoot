package com.qiuwu.service;

import com.qiuwu.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
public interface UserService extends IService<User> {
    //    用户登录
    User login(String uname, String upwd);
}
