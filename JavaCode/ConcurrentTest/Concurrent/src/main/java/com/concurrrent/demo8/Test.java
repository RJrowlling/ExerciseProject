package com.concurrrent.demo8;

import java.util.concurrent.Exchanger;

/**
 * @Author cjy
 * @Date 2024/3/30 17:02
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        final Exchanger<String> exch = new Exchanger<>();

        new Thread(() -> {
            String A = "我是A线程发送过来的";
            try {
                String exchange = exch.exchange(A);
                System.out.println(Thread.currentThread().getName() + " 接收到了 " + exchange);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"A线程").start();

        new Thread(() -> {
            String A = "我是B线程发送过来的";
            try {
                String exchange = exch.exchange(A);
                System.out.println(Thread.currentThread().getName() + " 接收到了 " + exchange);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"B线程").start();
    }
}
