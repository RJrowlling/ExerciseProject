package com.cjy.homework03;

public class Teacher {
    String name;
    int age;
    String post;
    double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("这是一个老师");
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("职称：" + this.post);
        System.out.println("基本工资：" + this.salary);
    }
}
