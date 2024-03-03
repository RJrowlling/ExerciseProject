package com.cjy.homework01;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("小明",26,"学生");
        p[1] = new Person("小红",23,"工人");
        p[2] = new Person("小强",21,"老师");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        System.out.println("____________________________");
        new SortPerson().sortPerson(p);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

class SortPerson {
    public void sortPerson(Person[] peopleArr) {
        for (int i = 0; i < peopleArr.length - 1; i++) {
            for (int j = 0; j < peopleArr.length - 1 - i; j++) {
                if (peopleArr[j].getAge() > peopleArr[j+1].getAge()) {
                    Person temp = peopleArr[j];
                    peopleArr[j] = peopleArr[j+1];
                    peopleArr[j+1] = temp;
                }
            }

        }
    }
}
