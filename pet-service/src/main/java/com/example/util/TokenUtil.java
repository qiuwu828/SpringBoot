package com.example.util;

import java.util.UUID;

/**
 * @author 丘戊
 * @package com.example.util
 * @title
 * @date 3/5/2022 下午 3:34
 */
public class TokenUtil {
    public static String createToken() {
//        使用UUID生成36位字符串去除空格后返回30位token
        String token = UUID.randomUUID().toString().replace("-", "");
        return token;
    }
}
