package com.cjy.demo5;

/**
 * @Author cjy
 * @Date 2024/4/10 13:33
 * @Version 1.0
 * @Description:
 */
public class User extends People{
    public static void main(String[] args) {

    }
    private static final int AGE = 18;

    private int age;
    private String id;
    public String name;

    public User() {
        id = "id_001";
        name = "cg";
        age = AGE;
    }

    public String getUserInfo() {
        return id + ":" + name + ":" + age;
    }
}
