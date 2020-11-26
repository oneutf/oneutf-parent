package com.oneutf.threadPool.factory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author oneutf
 */
public class DefaultThreadFactory implements ThreadFactory {

    private AtomicInteger atomicInteger = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r, "defaultThreadFactory" + atomicInteger.getAndIncrement());
    }
}
