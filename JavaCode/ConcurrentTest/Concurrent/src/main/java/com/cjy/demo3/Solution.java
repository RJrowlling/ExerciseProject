package com.cjy.demo3;

/**
 * @Author cjy
 * @Date 2024/3/27 10:52
 * @Version 1.0
 * @Description: 生产者消费者问题，synchronized版,应该可以看到各个线程交替执行
 */
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "A线程").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.decrement();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "B线程").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "C线程").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.decrement();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "D线程").start();
    }
}

//资源类
class Date {
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        while (number != 0) { // number==1时,就等待
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "，执行了++操作，此时number的值——>" + number);
        this.notify(); //执行完number++后，唤醒其他线程
    }

    public synchronized void decrement() throws InterruptedException {
        while (number == 0) { // number==0时,就等待
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "，执行了--操作，此时number的值——>" + number);

        this.notify(); //执行完number--后，唤醒其他线程
    }
}