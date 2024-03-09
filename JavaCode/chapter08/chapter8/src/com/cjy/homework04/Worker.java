package com.cjy.homework04;

public class Worker extends Employee{
    public Worker(String name, double wage, int workDay) {
        super(name, "普通工人", wage, workDay);
    }
    double salary = this.wage * this.workDay * 1.0;

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("累计薪水：" + this.salary);
    }
}
