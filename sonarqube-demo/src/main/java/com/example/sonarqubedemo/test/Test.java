package com.example.sonarqubedemo.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author purgeyao
 * @since 1.0
 */
public class Test {

    public static void main(String[] args) {
        // 演示线程池不规范创建 p3c 会警告
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(() -> System.out.println("123"), 1, TimeUnit.SECONDS);
        scheduledThreadPool.shutdown();
    }
}
