package com.oneutf.cache.util;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * @author oneutf
 * @desc redis工具类
 */
@Component
@RequiredArgsConstructor
public class RedisUtils {

    private final RedisTemplate redisTemplate;

    public <T> void setCacheObject(String key, T value) {
        ValueOperations<String, T> opsForValue = redisTemplate.opsForValue();
        opsForValue.set(key, value);
    }

    public <T> T getCacheObject(String key) {
        ValueOperations<String, T> opsForValue = redisTemplate.opsForValue();
        return opsForValue.get(key);
    }

}
