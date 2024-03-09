package com.cjy.enum_;

/**
 * @author cjy
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Week[] values = Week.values();

        for (Week value : values) {
            System.out.println(value);
        }
    }
}
