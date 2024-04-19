package com.concurrrent.demo4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @Author cjy
 * @Date 2024/3/30 16:35
 * @Version 1.0
 * @Description:
 */
public class Test1 {
    public static AtomicIntegerFieldUpdater<Person> old = AtomicIntegerFieldUpdater.newUpdater(Person.class, "old");

    public static void main(String[] args) {
        Person person = new Person("cjy", 23);
        System.out.println(old.getAndIncrement(person));
        System.out.println(old.get(person));
    }
}

class Person {
    private String name;
    public volatile int old;

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
