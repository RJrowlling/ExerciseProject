package com.concurrrent.demo2;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @Author cjy
 * @Date 2024/3/30 16:18
 * @Version 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(new int[]{1, 2, 3, 4, 5});
        System.out.println(array.get(0));
        System.out.println(array.compareAndSet(1, 2, 10));
        System.out.println(array);
    }
}
