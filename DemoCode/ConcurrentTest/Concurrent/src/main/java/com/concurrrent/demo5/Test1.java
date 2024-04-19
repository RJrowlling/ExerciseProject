package com.concurrrent.demo5;

import java.util.concurrent.CountDownLatch;

/**
 * @Author cjy
 * @Date 2024/3/30 16:43
 * @Version 1.0
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " 完成任务");
                countDownLatch.countDown();
            },String.valueOf(i)+"线程").start();
        }

        countDownLatch.await();
        System.out.println("所有任务完成");
    }
}
