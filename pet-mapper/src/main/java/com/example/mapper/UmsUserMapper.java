package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.UmsUser;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author hunter
 * @since 2022-05-04
 */
public interface UmsUserMapper extends BaseMapper<UmsUser> {
    public UmsUser login(String username, String password);
}
