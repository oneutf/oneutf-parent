package com.oneutf.cache.util;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author oneutf
 * @desc redis工具类
 */
@Component
@RequiredArgsConstructor
public class RedisUtils {

    private final RedisTemplate<String, Object> redisTemplate;

    public void setCacheObject(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getCacheObject(String key) {
        return redisTemplate.opsForValue().get(key);
    }

}
