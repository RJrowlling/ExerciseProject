package com.cjy.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author cjy
 * @Date 2024/3/27 10:03
 * @Version 1.0
 * @Description: 采用JUC的Lock锁来解决多线程问题
 */
public class Solution {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket.saleTicket();
            }

        },"A售票员").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket.saleTicket();
            }

        },"B售票员").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket.saleTicket();
            }

        },"C售票员").start();
    }
}

//资源类
class Ticket {
    private int ticketNumber = 30;
//    1.定义锁
    private Lock lock = new ReentrantLock();

    public void saleTicket() {
//        2.上锁
        lock.lock();

        try {
            if (ticketNumber > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖了" + (ticketNumber--) + "号票，" +
                        "剩余" + ticketNumber + "张票");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            3.解锁
            lock.unlock();
        }
    }
}
