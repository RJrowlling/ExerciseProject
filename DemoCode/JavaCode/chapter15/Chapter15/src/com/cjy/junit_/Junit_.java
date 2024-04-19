package com.cjy.junit_;

import org.junit.jupiter.api.Test;

/**
 * @author cjy
 * @version 1.0
 */
public class Junit_ {
    public static void main(String[] args) {
//        new Test().m1();
//        new Test().m2();
    }

    @Test
    public void m1 () {
        System.out.println("我是m1方法");
    }

    @Test
    public void m2 () {
        System.out.println("我是m2方法");
    }

}
