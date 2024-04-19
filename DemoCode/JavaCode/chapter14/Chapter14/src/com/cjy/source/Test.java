package com.cjy.source;

import java.util.*;

/**
 * @author cjy
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
//        ArrayList arr = new ArrayList(4);
//        for (int i = 0; i < 15; i++) {
//            arr.add(i);
//        }
//        System.out.println(arr);
//
//        Vector arr1 = new Vector();
//        for (int i = 0; i < 15; i++) {
//            arr1.add(i);
//        }
//
//        LinkedList link = new LinkedList();
//        for (int i = 0; i < 10; i++) {
//            link.add(i);
//        }
        HashSet hashSet = new HashSet();

        for (int i = 0; i < 15; i++) {
            hashSet.add(new A(i));

        }
//        hashSet.add(new A(100));
//        hashSet.add(new A(101));
//        hashSet.add(new A(102));
//        hashSet.add(new A(103));

    }
}

class A {
    int age;

    public A(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return age == a.age;
    }

    @Override
    public int hashCode() {
        //(key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        return 200;
    }
}