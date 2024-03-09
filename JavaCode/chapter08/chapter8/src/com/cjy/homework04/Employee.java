package com.cjy.homework04;

public class Employee {
    String name;
    String post;
    double wage;
    int workDay;

    public Employee(String name, String post, double wage, int workDay) {
        this.name = name;
        this.post = post;
        this.wage = wage;
        this.workDay = workDay;
    }

    public void printSalary() {
        System.out.println("姓名：" + this.name);
        System.out.println("职位：" + this.post);
        System.out.println("日工资：" + this.wage);
        System.out.println("工作天数：" + this.workDay);
    }
}
