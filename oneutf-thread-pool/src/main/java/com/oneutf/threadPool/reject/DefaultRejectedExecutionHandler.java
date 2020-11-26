package com.oneutf.threadPool.reject;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author oneutf
 */
@Slf4j
public class DefaultRejectedExecutionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        log.error("线程池的线程数量超过最大值{},线程已被抛弃", executor.getMaximumPoolSize() + executor.getQueue().size());
    }
}
