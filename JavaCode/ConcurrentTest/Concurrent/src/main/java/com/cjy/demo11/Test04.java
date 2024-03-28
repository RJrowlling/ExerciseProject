package com.cjy.demo11;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author cjy
 * @Date 2024/3/28 11:41
 * @Version 1.0
 * @Description: 练习 超时退出 的阻塞队列
 */
public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a", 3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("b", 3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("c", 3, TimeUnit.SECONDS));
        //如果阻塞队列满了，还offer的话,这个offer操作会阻塞3秒，如果3秒过后，阻塞队列仍满的话，就退出offer操作
//        System.out.println(blockingQueue.offer("d", 3, TimeUnit.SECONDS));

        System.out.println("__________________________");

        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
        //如果阻塞队列为空，还poll的话,这个poll操作会阻塞3秒，如果3秒过后，阻塞队列仍为空的话，就退出poll操作
//        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
    }
}
