package com.concurrrent.demo3;

import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author cjy
 * @Date 2024/3/30 16:27
 * @Version 1.0
 * @Description:
 */
public class Test1 {

    public static AtomicReference<Person> atomicReference = new AtomicReference<>();
    public static void main(String[] args) {
        Person person = new Person("cjy", 22);
        atomicReference.set(person);
        Person person1 = new Person("hcc", 18);
        atomicReference.compareAndSet(person,person1);
        System.out.println(atomicReference.get().getName());
        System.out.println(atomicReference.get().getOld());
    }
}

class Person {
    private String name;
    private int old;

    public Person(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }
}
