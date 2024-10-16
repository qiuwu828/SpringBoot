package com.qiuwu.service.impl;

import com.qiuwu.entity.User;
import com.qiuwu.mapper.UserMapper;
import com.qiuwu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    /*
     * 用户登录
     * */
    @Override
    public User login(String uname, String upwd) {
        return userMapper.getUserByNameAndPwd(uname, upwd);
    }
}
