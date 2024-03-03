package com.cjy.homework05;

public class Worker extends Person{
    public Worker(String name, double salary) {
        super(name, "工人", salary);
    }

    @Override
    public void printAnnulSalary() {
        super.printAnnulSalary();
        System.out.println("全年工资：" + this.salary * 12);
    }
}
