package com.cjy.overload;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("陈俊宇",23);
        Student student = new Student("陈俊宇",23,123456,99);
        person.say();
        student.say();

    }
}
