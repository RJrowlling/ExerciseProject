package com.cjy.demo9;

import java.util.concurrent.Semaphore;

/**
 * @Author cjy
 * @Date 2024/3/28 9:04
 * @Version 1.0
 * @Description: 练习Semaphore，现在有三个停车位，6辆车
 */
public class Test03 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);// 模拟资源类，有3个空车位

        for (int i = 0; i < 6; i++) {// 模拟6个车
            new Thread(() -> {
                try {
                    semaphore.acquire();// acquire 得到
                    System.out.println(Thread.currentThread().getName() + " 正在停车");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    semaphore.release();// 释放这个位置
                }
            },"车"+String.valueOf(i)).start();
        }
    }
}
