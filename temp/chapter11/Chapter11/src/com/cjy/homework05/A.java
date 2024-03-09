package com.cjy.homework05;

/**
 * @author cjy
 * @version 1.0
 */
public class A {
    private final String name = "cjy";
    class B {
        private final String name = "陈俊宇";

        public void show() {
            System.out.println(name);
            System.out.println(A.this.name);
        }
    }
}
