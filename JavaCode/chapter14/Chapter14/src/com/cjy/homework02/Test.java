package com.cjy.homework02;

import java.util.ArrayList;

/**
 * @author cjy
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("宝马",400000);
        Car car2 = new Car("宾利",1000000);
        ArrayList arrayList = new ArrayList();

        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList);
        arrayList.remove(car1);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(car2));
        System.out.println(arrayList.contains(car1));
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.size());

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(car1);
        arrayList2.add(car2);
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        System.out.println(arrayList.containsAll(arrayList2));
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);

        for (Object item : arrayList2) {
            System.out.println(item.toString());
        }

    }
}
