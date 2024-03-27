package com.cjy.demo7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @Author cjy
 * @Date 2024/3/27 16:12
 * @Version 1.0
 * @Description: 单线程下（集合类十分安全）
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        只有一个主线程，每次循环添加一个随机的字符串到list中，并打印
        for (int i = 0; i < 10; i++) {
            list.add(UUID.randomUUID().toString().substring(0,5));
            System.out.println(list);
        }
    }
}
