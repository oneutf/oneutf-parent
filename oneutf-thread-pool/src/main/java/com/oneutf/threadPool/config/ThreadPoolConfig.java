package com.oneutf.threadPool.config;

import com.oneutf.threadPool.factory.DefaultThreadFactory;
import com.oneutf.threadPool.reject.DefaultRejectedExecutionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author oneutf
 */
@Configuration
@Slf4j
public class ThreadPoolConfig {

    /**
     * 核心线程数
     */
    @Value(value = "${oneutf.thread.pool.corePoolSize:2}")
    private int corePoolSize;

    /**
     * 最大线程池大小
     */
    @Value(value = "${oneutf.thread.pool.maximumPoolSize:8}")
    private int maximumPoolSize;

    /**
     * 线程最大空闲时间
     */
    @Value(value = "${oneutf.thread.pool.keepAliveTime:120}")
    private long keepAliveTime;

    /**
     * 队列长度
     */
    @Value(value = "${oneutf.thread.pool.capacity:10}")
    private int capacity;

    @Bean
    public ExecutorService executorService() {
        return new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
                TimeUnit.MINUTES, new LinkedBlockingQueue<>(10), new DefaultThreadFactory(),
                new DefaultRejectedExecutionHandler());
    }
}
