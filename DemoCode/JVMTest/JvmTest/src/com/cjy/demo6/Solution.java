package com.cjy.demo6;

/**
 * @Author cjy
 * @Date 2024/4/10 15:47
 * @Version 1.0
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };
    }
}

class User {
    String name;
}
