package com.cjy.homework02;

/**
 * @author cjy
 * @version 1.0
 */
public class TestFork {
    public static void main(String[] args) {
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        System.out.println(fork1.getSerialNumber());
        System.out.println(fork2.getSerialNumber());
    }
}
