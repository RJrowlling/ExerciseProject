package com.cjy.demo7;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author cjy
 * @Date 2024/3/27 16:15
 * @Version 1.0
 * @Description: 多线程下，直接向集合中add元素会报ConcurrentModificationException异常
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        十个线程，每个线程添加一个随机的字符串到list中，并打印
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    list.add(UUID.randomUUID().toString().substring(0,5));
                    System.out.println(list);;
                }
            }).start();
        }
    }
}
