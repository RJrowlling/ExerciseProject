package com.cjy.demo12;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author cjy
 * @Date 2024/3/28 15:00
 * @Version 1.0
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        try {
            for (int i = 1; i <= 9; i++) {
                int finalI = i;
                threadPoolExecutor.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " 办理业务" + finalI);
                });
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            threadPoolExecutor.shutdown();
        }

    }
}
