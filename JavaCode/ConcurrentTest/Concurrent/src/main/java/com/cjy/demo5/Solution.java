package com.cjy.demo5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author cjy
 * @Date 2024/3/27 13:55
 * @Version 1.0
 * @Description: 利用JUC下的Condition来实现多线程的顺序控制
 */
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        new Thread(() -> {for (int i = 0; i < 10; i++) date.printA();},"A线程").start();
        new Thread(() -> {for (int i = 0; i < 10; i++) date.printB();},"B线程").start();
        new Thread(() -> {for (int i = 0; i < 10; i++) date.printC();},"C线程").start();
    }
}

class Date {
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    private int number = 0;

    public void printA() {
        lock.lock();
        try {
            while (number != 0) { //number！=0时，A线程循环等待
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "——》AAAAAAAAAAAA");
            number = 1;
            condition2.signal(); //A执行完后，唤醒B线程
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void printB() {
        lock.lock();
        try {
            while (number != 1) { //number！=1时，B线程循环等待
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName() + "——》BBBBBBBBBBB");
            number = 2;
            condition3.signal(); //B执行完后，唤醒C线程
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void printC() {
        lock.lock();
        try {
            while (number != 2) { //number！=2时，C线程循环等待
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName() + "——》CCCCCCCCCCCC");
            number = 0;
            condition1.signal(); //C执行完后，唤醒A线程
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
