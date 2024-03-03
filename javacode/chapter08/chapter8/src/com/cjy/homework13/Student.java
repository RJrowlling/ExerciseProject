package com.cjy.homework13;

public class Student extends Person{
    int stu_id;
    public Student(String name, char sex, int age, int id) {
        super(name, sex, age);
        this.stu_id = id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("学号：" + this.stu_id);
        this.study();
        super.play();
    }
}
