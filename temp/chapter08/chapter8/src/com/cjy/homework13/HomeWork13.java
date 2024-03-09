package com.cjy.homework13;

public class HomeWork13 {
    public static void main(String[] args) {
        Student student = new Student("陈俊宇",'男',23,180214);
        Teacher teacher = new Teacher("小强",'男',40,8);
        student.showInfo();
        teacher.showInfo();
    }
}
