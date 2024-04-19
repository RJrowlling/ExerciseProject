package com.cjy.homework04;

/**
 * @author cjy
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Cellphone().testWork(new PcInterface() {
            @Override
            public void work() {
                System.out.println("我是匿名内部类，作为实参重写了work方法");
            }
        });
    }
}
