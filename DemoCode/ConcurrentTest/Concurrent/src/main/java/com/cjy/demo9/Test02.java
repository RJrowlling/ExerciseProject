package com.cjy.demo9;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author cjy
 * @Date 2024/3/28 8:49
 * @Version 1.0
 * @Description: 练习CyclicBarrier, 集齐七颗龙珠召唤神龙
 */
public class Test02 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("七颗龙珠已集齐，开始召唤神龙");
        });

        for (int i = 0; i < 7; i++) {
            final int temp = i;
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " 收集了龙珠" + temp);
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            },"线程"+String.valueOf(i)).start();
        }
    }
}
