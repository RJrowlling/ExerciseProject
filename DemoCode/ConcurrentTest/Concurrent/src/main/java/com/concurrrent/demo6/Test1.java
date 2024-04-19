package com.concurrrent.demo6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author cjy
 * @Date 2024/3/30 16:48
 * @Version 1.0
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(11);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+" 正在等待。。。");
                try {
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName() + " 完成任务");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            },String.valueOf(i) + "线程").start();
        }

        System.out.println("第十一个线程还有5秒到达");
        Thread.sleep(5000);
        cyclicBarrier.await();
        System.out.println(Thread.currentThread().getName() + " 完成任务");

    }
}
