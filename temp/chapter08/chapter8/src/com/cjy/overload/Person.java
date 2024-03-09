package com.cjy.overload;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("你的名字为：" + this.name);
        System.out.println("你的年龄为：" + this.age);
    }
}
