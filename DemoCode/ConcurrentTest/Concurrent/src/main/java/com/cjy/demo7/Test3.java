package com.cjy.demo7;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author cjy
 * @Date 2024/3/27 16:22
 * @Version 1.0
 * @Description: 解决多线程下，集合类的并发问题，解决方案如下：
 * 1. List<String> list = new Vector<>(); JDK1.0 就存在了！
 * 2. List<String> list = Collections.synchronizedList(new ArrayList<>());
 * 3. List<String> list = new CopyOnWriteArrayList<>();
 *
 *  1 故障现象：ConcurrentModificationException
 *  2 导致原因：add 方法没有加锁
 *  3 解决方案：换一个集合类
 */

public class Test3 {
    public static void main(String[] args) {
//        List<String> list = new Vector<>();

//        List<String> listTemp = new ArrayList<>();
//        List<String> list = Collections.synchronizedList(listTemp);

        List<String> list = new CopyOnWriteArrayList<>();


        for (int i = 0; i < 20; i++) {
            list.add(UUID.randomUUID().toString().substring(0,5));
            System.out.println(list);
        }
    }
}
