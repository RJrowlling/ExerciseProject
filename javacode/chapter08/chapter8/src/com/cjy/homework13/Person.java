package com.cjy.homework13;

public class Person {
    String name;
    char sex;
    int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void play() {
        if (this instanceof Teacher) {
            System.out.println(this.name + "爱玩象棋");
        }
        if (this instanceof Student) {
            System.out.println(this.name + "爱玩足球");
        }
    }

    public void showInfo() {
        System.out.println("姓名：" + this.name);
        System.out.println("性别：" + this.sex);
        System.out.println("年龄：" + this.age);
    }
}
