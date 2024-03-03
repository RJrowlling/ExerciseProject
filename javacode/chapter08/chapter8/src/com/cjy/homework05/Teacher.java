package com.cjy.homework05;

public class Teacher extends Person{
    double classDay;
    double classSalary = 100;
    public Teacher(String name, double salary, double classDay) {
        super(name, "教师", salary);
        this.classDay = classDay;
    }

    @Override
    public void printAnnulSalary() {
        super.printAnnulSalary();
        System.out.println("全年工资：" + (this.salary * 12 + classDay * classSalary));
    }
}
