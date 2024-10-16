package com.qiuwu.mapper;

import com.qiuwu.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    //    通过用户名和密码进行登录
    User getUserByNameAndPwd(@Param("uname") String uname, @Param("upwd") String upwd);
}
