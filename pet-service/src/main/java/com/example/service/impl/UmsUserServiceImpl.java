package com.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.entity.UmsUser;
import com.example.mapper.UmsUserMapper;
import com.example.redis.RedisService;
import com.example.service.UmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.util.TokenUtil;
import com.example.util.UmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author hunter
 * @since 2022-05-04
 */
@Service
public class UmsUserServiceImpl extends ServiceImpl<UmsUserMapper, UmsUser> implements UmsUserService {
    @Autowired
    private UmsUserMapper umsUserMapper;

    @Autowired
    RedisService redisService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Override
    public String login(String username, String password) {
        UmsUser user = umsUserMapper.login(username, password);
        if (user == null) {
            return null;
        }
        //创建token，存入redis，返回客户端
        String tokrn = createUserToken(user);
        return tokrn;
    }

    private String createUserToken(UmsUser user) {
        String token = TokenUtil.createToken();
        //给token添加前缀，存入redis
//        此处可能出错
        String tokenKey = UmsUtil.generateTokenRedisKey(token);
        redisService.putValue(tokenKey, JSON.toJSONString(user));
        return token;
    }
}
