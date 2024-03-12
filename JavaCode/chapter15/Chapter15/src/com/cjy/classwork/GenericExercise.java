package com.cjy.classwork;

import java.util.*;

/**
 * @author cjy
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<Student>();
        studentHashSet.add(new Student("陈俊宇",23));
        studentHashSet.add(new Student("小明",24));
        studentHashSet.add(new Student("小红",25));

        for (Student student : studentHashSet) {
            System.out.println(student.getName() + "-" + student.getAge());
        }

        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("陈俊宇",new Student("陈俊宇",23));
        studentHashMap.put("小明",new Student("小明",23));
        studentHashMap.put("小红",new Student("小红",23));

        Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue().getAge());
        }

    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
