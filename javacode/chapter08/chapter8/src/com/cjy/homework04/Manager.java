package com.cjy.homework04;

public class Manager extends Employee{
    public Manager(String name, double wage, int workDay) {
        super(name, "经理", wage, workDay);
    }
    double salary = 1000 + this.wage * this.workDay * 1.2;

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("累计薪水：" + this.salary);
    }
}
