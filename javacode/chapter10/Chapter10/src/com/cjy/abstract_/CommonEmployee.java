package com.cjy.abstract_;

public class CommonEmployee extends Employee{

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("我是员工"+this.name+"，工作中。。。");

    }
}
