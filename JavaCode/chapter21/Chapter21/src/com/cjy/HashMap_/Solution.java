package com.cjy.HashMap_;

import java.util.HashMap;

/**
 * @Author cjy
 * @Date 2024/3/26 14:56
 * @Version 1.0
 */
public class Solution {
    private static HashMap<Integer,String> map = new HashMap<Integer,String>(2,0.75f);

    public static void main(String[] args) {
        map.put(5, "C");

        new Thread(() -> {
            map.put(7,"B");
            System.out.println(map);
        },"Thread1").start();

        new Thread(() -> {
            map.put(3,"A");
            System.out.println(map);
        },"Thread2").start();

    }
}
