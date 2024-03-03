package com.cjy.homework10;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("小明",23,"护士",'男',1000);
        Doctor doctor2 = new Doctor("小明",23,"护士",'男',1000);
        Doctor doctor3 = new Doctor("小红",23,"护士",'女',1000);

        System.out.println(doctor1.equals(doctor2));
        System.out.println(doctor1.equals(doctor3));
    }
}
