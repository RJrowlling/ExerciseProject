package com.cjy.classwork02;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author cjy
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);

        arrayList.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return (int) o2 - (int) o1;
            }
        });
        System.out.println(arrayList);

    }
}
