package com.cjy.homework13;

public class Teacher extends Person{
    int work_age;
    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会好好教学");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("工龄：" + this.work_age);
        this.teach();
        super.play();
    }
}
