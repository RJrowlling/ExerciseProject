package com.cjy.homework02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author cjy
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\cjy\\Desktop\\自我评价——202321116012665陈俊宇.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s;
        int count = 1;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(count + "、" + s);
            count++;
        }
        bufferedReader.close();
    }
}
