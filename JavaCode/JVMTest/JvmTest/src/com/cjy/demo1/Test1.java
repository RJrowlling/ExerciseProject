package com.cjy.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/6 10:53
 * @Version 1.0
 * @Description:
 */
public class Test1 {

    public static int count = 0;

    public static void main(String[] args) {
        try {
            method01();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }

    public static void method01() {
//        method02(1,2);
        count++;
//       method01();
//        List<Integer> list = new ArrayList<>();
    }

    public static int method02(int a, int b) {
        int c = a + b;
        return c;
    }
}
