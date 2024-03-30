package com.concurrrent.demo7;

import java.util.concurrent.Semaphore;

/**
 * @Author cjy
 * @Date 2024/3/30 16:55
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " 执行任务");
                    Thread.sleep(3000);
                    semaphore.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            },String.valueOf(i) + "线程").start();
        }
    }
}
