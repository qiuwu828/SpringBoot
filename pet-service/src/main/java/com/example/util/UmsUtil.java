package com.example.util;

/**
 * @author 丘戊
 * @package com.example.util
 * @title
 * @date 3/5/2022 下午 3:34
 */
public class UmsUtil {
    public static String generateTokenRedisKey(String token) {
        //封装token，生成redis、tokenKey
        String tokenKey = "pet:token:" + token;
        //返回redis、tokenKey
        return tokenKey;
    }
}
