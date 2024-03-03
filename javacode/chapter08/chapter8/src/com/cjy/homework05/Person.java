package com.cjy.homework05;

public class Person {
    String name;
    String job;
    double salary;

    public Person(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void printAnnulSalary() {
        System.out.println("姓名：" + this.name);
        System.out.println("工作：" + this.job);
        System.out.println("月工资：" + this.salary);
    }
}
