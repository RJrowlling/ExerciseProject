package com.cjy.poly;

public class Employee {
    public String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual() {
        return 12 * this.salary;
    }
}

class Person extends Employee {
    public Person(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("工人："+this.name+"，正在工作...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}

class Manage extends Employee{
    double bonus;

    public Manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理："+this.name+"，正在管理...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}