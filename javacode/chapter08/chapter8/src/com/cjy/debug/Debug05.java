package com.cjy.debug;

public class Debug05 {
    public static void main(String[] args) {
        Person person = new Person("陈俊宇",23);
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}