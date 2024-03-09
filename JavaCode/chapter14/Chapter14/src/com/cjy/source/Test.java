package com.cjy.source;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author cjy
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(4);
        for (int i = 0; i < 15; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        Vector arr1 = new Vector();
        for (int i = 0; i < 15; i++) {
            arr1.add(i);
        }

        LinkedList link = new LinkedList();
        for (int i = 0; i < 10; i++) {
            link.add(i);
        }
    }
}
