package com.cjy.demo9;

import java.util.concurrent.CountDownLatch;

/**
 * @Author cjy
 * @Date 2024/3/28 8:36
 * @Version 1.0
 * @Description: 练习CountDownLatch
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " 执行了减1操作");
                //计数器减1
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }

        //阻塞等待计数器归零
        countDownLatch.await();
        System.out.println("所有线程都执行减一操作完毕");
    }
}
