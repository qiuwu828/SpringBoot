package com.example.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author 丘戊
 * @package com.example.redis
 * @title
 * @date 3/5/2022 下午 3:34
 */
@Component
public class RedisService {
    private static Logger logger = LoggerFactory.getLogger((RedisService.class));

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    /**
     * 存储key-value
     *
     * @param key
     * @param value
     */
    public void putValue(String key, String value) {
        try {
            stringRedisTemplate.opsForValue().set(key, value);
            //打印日志，使用模板字符串
            //logger.info("[REDIS] put k-v key=%s,value=%s",key,value)
            logger.info("[REDIS] put k-v key={},value={}", key, value);
        } catch (Exception e) {
            logger.error("[REDIS-ERROR] put k-v key={},value={}", key, value);
        }
    }

    /**
     * 存储key-value，设置过期时间
     *
     * @param key
     * @param value
     * @param seconds 过期时间，单位秒
     */
    public void putValue(String key, String value, long seconds) {
        try {
            stringRedisTemplate.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);
            //打印日志，使用模板字符串
            //logger.info("[REDIS] put k-v key=%s,value=%s",key,value)
            logger.info("[REDIS] put k-v key=%s,value=%s", key, value, seconds);
        } catch (Exception e) {
            logger.error("[REDIS-ERROR] put k-v key=%s,value=%s", key, value, seconds);
        }
    }
}
