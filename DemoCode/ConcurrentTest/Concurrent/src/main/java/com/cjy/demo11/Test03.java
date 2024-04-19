package com.cjy.demo11;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author cjy
 * @Date 2024/3/28 11:33
 * @Version 1.0
 * @Description: 练习 一直阻塞 的阻塞队列
 */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        //如果阻塞队列满了，还put的话，该put操作会一直阻塞在这里，直到阻塞队列出队元素
//        blockingQueue.put("d");

        System.out.println("__________________________");

        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        //如果阻塞队列为空，还take的话，该take操作会一直阻塞在这里，直到阻塞队列有进队元素
//        System.out.println(blockingQueue.take());
    }
}
