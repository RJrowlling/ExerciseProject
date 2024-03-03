package com.cjy.homework03;

public class AssistantProfessor extends Teacher{
    public AssistantProfessor(String name, int age, double salary) {
        super(name, age, "副教授", salary*1.2);
    }

    @Override
    public void introduce() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("职称：" + this.post);
        System.out.println("基本工资：" + this.salary);
    }
}
