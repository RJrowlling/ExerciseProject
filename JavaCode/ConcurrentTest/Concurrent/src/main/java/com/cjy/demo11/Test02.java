package com.cjy.demo11;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author cjy
 * @Date 2024/3/28 11:25
 * @Version 1.0
 * @Description: 练习 返回特殊值 的阻塞队列
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        //不会抛出异常，如果添加失败就返回false
//        System.out.println(blockingQueue.offer("d"));

        System.out.println("________________________");
        System.out.println(blockingQueue.peek());//返回队首元素

        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        //不会抛出异常，如果删除失败就返回null
//        System.out.println(blockingQueue.poll());


    }
}
