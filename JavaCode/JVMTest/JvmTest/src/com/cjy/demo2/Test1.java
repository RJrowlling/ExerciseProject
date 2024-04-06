package com.cjy.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/6 13:40
 * @Version 1.0
 * @Description: 堆内存溢出
 */
public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        String a = "hello";
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
