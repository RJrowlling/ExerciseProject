package com.cjy.demo7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author cjy
 * @Date 2024/3/27 16:43
 * @Version 1.0
 * @Description:
 *
 *1 故障现象：ConcurrentModificationException
 *2 导致原因：add 方法没有加锁
 *3 解决方案：换一个集合类
 *1、Set<String> set = new HashSet<>(); 默认
 *2、Set<String> set = Collections.synchronizedSet(new HashSet<>());
 *3、Set<String> set = new CopyOnWriteArraySet();
 *4 优化建议：（同样的错误，不出现第2次）
 */
public class Test4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

//        //单线程下，绝对安全
//        for (int i = 0; i < 20; i++) {
//            set.add(UUID.randomUUID().toString().substring(0,5));
//            System.out.println(set);
//        }

//        //多线程下，会报错ConcurrentModificationException
//        for (int i = 0; i < 20; i++) {
//            new Thread(() -> {
//                set.add(UUID.randomUUID().toString().substring(0,5));
//                System.out.println(set);
//            }).start();
//        }

        //多线程下，如何解决set类的并发问题

//        //1. Set<String> set = Collections.synchronizedSet(new HashSet<>());
//        Set<String> syncSet = Collections.synchronizedSet(set);
//        for (int i = 0; i < 20; i++) {
//            new Thread(() -> {
//                syncSet.add(UUID.randomUUID().toString().substring(0,5));
//                System.out.println(syncSet);
//            }).start();
//        }

        //2.Set<String> set = new CopyOnWriteArraySet();
        Set<String> setCOP = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 20; i++) {
            setCOP.add(UUID.randomUUID().toString().substring(0,5));
            System.out.println(setCOP);
        }
    }
}
