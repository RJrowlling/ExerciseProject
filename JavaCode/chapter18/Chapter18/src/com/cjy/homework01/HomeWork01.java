package com.cjy.homework01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cjy
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/mytemp");
        if (!file.exists()) {
            file.mkdir();
            File file1 = new File("E:/mytemp/hello.txt");
            if (!file1.exists()) {
                file1.createNewFile();
                FileWriter fileWriter = new FileWriter(file1);
                fileWriter.write("hello,world");
                fileWriter.close();
            } else {
                System.out.println("文件已经存在");
            }
        }
    }
}
