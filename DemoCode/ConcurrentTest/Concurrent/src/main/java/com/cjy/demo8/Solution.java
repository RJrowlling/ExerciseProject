package com.cjy.demo8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author cjy
 * @Date 2024/3/27 19:36
 * @Version 1.0
 * @Description: 使用Callable的方式创建线程，并获得线程的返回值
 */
public class Solution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        FutureTask<Integer> futureTask = new FutureTask<>(myThread);// 适配类
        new Thread(futureTask,"A线程").start(); // 调用执行
        new Thread(futureTask,"B线程").start(); //  第二次调用执行，会有结果缓存，不用再次计算

        //get 方法获得返回结果! 一般放在最后一行！否则可能会阻塞
        int i = futureTask.get();// 获取返回值
        System.out.println(i);
    }
}

class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " 调用了call()方法，并返回1024");
        return 1024;
    }
}
