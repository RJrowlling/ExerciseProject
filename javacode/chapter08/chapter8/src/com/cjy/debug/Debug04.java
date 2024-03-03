package com.cjy.debug;

import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {

        int[] arr1 = {8, -1, 199, 70, 10};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("退出for");
        System.out.println("退出for2");
        System.out.println("退出for3");
        System.out.println("退出for4");
        System.out.println("退出for5");
    }
}

