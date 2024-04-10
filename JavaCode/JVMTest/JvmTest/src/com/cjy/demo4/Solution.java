package com.cjy.demo4;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @Author cjy
 * @Date 2024/4/10 9:33
 * @Version 1.0
 * @Description:
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
//        //强引用
//        Object object = new Object();
//        String a = "AAA";
//
//
//        //软引用
//        Person cjy = new Person("cjy");
//        SoftReference<Person> sr = new SoftReference<>(cjy);
//        System.out.println(sr.get().getName());
//
//        //弱引用
//        WeakReference<String> wr = new WeakReference<>(new String("hello"));
//        System.out.println(wr.get());
//        System.gc();
//        System.out.println(wr.get());

        //虚引用
        ReferenceQueue<String> queue = new ReferenceQueue<>();
        PhantomReference<String> pr = new PhantomReference<>(new String("hhh"), queue);
        System.out.println(pr.get());
        System.gc();
        Thread.sleep(1000); //等待GC完成
        System.out.println(queue.poll());


    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
