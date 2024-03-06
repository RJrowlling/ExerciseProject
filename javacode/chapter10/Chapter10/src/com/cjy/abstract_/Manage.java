package com.cjy.abstract_;

public class Manage extends Employee{
    double bonus;
    public Manage(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("我是经理"+this.name+"，工作中。。。");
    }
}
