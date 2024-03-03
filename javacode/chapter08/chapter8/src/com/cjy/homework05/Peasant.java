package com.cjy.homework05;

public class Peasant extends Person{
    public Peasant(String name, double salary) {
        super(name, "农民", salary);
    }

    @Override
    public void printAnnulSalary() {
        super.printAnnulSalary();
        System.out.println("全年工资：" + this.salary * 12);
    }
}
