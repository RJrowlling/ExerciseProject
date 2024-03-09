package com.cjy.houserent;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 完成用户各种输入
 * @author cjy
 * @version 1.0
 */
public class Utility {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String stdTime(Date date) {
        return simpleDateFormat.format(date);
    }
}
