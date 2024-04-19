package com.cjy.homework05;

public class Scientist extends Person{
    double bonus = 2000;
    public Scientist(String name, double salary) {
        super(name, "科学家", salary);
    }

    @Override
    public void printAnnulSalary() {
        super.printAnnulSalary();
        System.out.println("全年工资：" + (this.salary * 12 + this.bonus));
    }
}
