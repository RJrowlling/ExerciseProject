package com.cjy.demo1;

/**
 * @Author cjy
 * @Date 2024/3/27 8:23
 * @Version 1.0
 * @Description: 采用传统的方式去解决多线程问题，没有用到JUC
 */
public class Demo1 {
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

    public synchronized void saleTicket() {
        if (ticketNumber > 0) {
            System.out.println(Thread.currentThread().getName() + " 卖了" + (ticketNumber--) + "号票，" +
                    "剩余" + ticketNumber + "张票");
        }
    }
}