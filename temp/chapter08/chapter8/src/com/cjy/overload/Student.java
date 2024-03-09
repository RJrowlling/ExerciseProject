package com.cjy.overload;

public class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public void say() {
        super.say();
        System.out.println("你的id为：" + this.id);
        System.out.println("你的分数为：" + this.score);
    }
}
