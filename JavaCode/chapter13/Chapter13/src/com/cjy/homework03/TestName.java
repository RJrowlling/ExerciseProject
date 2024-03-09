package com.cjy.homework03;

/**
 * @author cjy
 * @version 1.0
 */
public class TestName {
    public static void main(String[] args) {
        String name = "chen jun yu";
        changeName(name);

    }

    public static void changeName(String name) {
        String[] strArr = name.split(" ");
        String cName = strArr[2] + "," + strArr[1] + " ." + strArr[0].toUpperCase().charAt(0);
        System.out.println(cName);
    }
}
