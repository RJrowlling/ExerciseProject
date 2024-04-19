package com.cjy.demo11;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author cjy
 * @Date 2024/3/28 11:11
 * @Version 1.0
 * @Description: 练习抛出异常的阻塞队列
 */
public class Test01 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
        //如果阻塞队列满了，还add的话会抛IllegalStateException: Queue full
//        System.out.println(blockingQueue.add("d"));

        System.out.println("________________________");

        System.out.println(blockingQueue.element()); //返回队首元素
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        //如果阻塞队列为空，还remove会抛NoSuchElementException
//        System.out.println(blockingQueue.remove());
    }
}
