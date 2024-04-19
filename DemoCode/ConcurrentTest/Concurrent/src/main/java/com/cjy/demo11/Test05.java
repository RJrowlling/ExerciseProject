package com.cjy.demo11;

import java.util.concurrent.SynchronousQueue;

/**
 * @Author cjy
 * @Date 2024/3/28 11:52
 * @Version 1.0
 * @Description: 练习 同步队列
 */
public class Test05 {
    public static void main(String[] args) {
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        //A线程向同步队列里面写入元素
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 写入元素" + i);
                    Thread.sleep(2000);
                    synchronousQueue.put(String.valueOf(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"A线程").start();

        //B线程向同步队列里面读出元素
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 读出元素" + i);
                    synchronousQueue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"B线程").start();
    }
}
