package com.cjy.demo4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author cjy
 * @Date 2024/3/27 11:47
 * @Version 1.0
 * @Description:
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
        },"A线程").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.decrement();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"B线程").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"C线程").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.decrement();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"D线程").start();
    }
}

//资源类
class Date {
    private int number = 0;
    //1.定义lock锁
    Lock lock = new ReentrantLock();
    //2.定义Condition
    Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (number != 0) { // number==1时,就等待
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "，执行了++操作，此时number的值——>" + number);
            condition.signalAll(); //执行完number++后，唤醒其他线程
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            while (number == 0) { // number==0时,就等待
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "，执行了--操作，此时number的值——>" + number);

            condition.signalAll(); //执行完number--后，唤醒其他线程
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}