package com.cjy.homework03;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age, double salary) {
        super(name, age, "讲师", salary*1.1);
    }

    @Override
    public void introduce() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("职称：" + this.post);
        System.out.println("基本工资：" + this.salary);
    }
}
