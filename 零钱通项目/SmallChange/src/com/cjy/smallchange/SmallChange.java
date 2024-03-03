package com.cjy.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        String key = "";
        double balance = 0;
        String detail = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        do {
            System.out.println("============零钱通菜单============");
            System.out.println("         1 零钱通明细");
            System.out.println("         2 收益  入账");
            System.out.println("         3 消     费");
            System.out.println("         4 退     出");
            System.out.println("请选择（1-4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println("--------------零钱通明细--------------");
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("请输入你的入账金额：");
                    double temp = scanner.nextDouble();
                    Date date = new Date();
                    String time = simpleDateFormat.format(date);
                    balance += temp;
                    detail += "收益入账\t" + "+" + temp + "\t" + time + "\t余额：" + balance + "\n";
                    break;
                case "3":
                    System.out.println("请输入你的消费项目：");
                    String note = scanner.next();
                    System.out.println("请输入你的消费金额：");
                    double consume = scanner.nextDouble();
                    if (consume > balance) {
                        System.out.println("您的消费"+ consume +"大于您的余额"+ balance +"，不能消费");
                        break;
                    }
                    Date date1 = new Date();
                    String time1 = simpleDateFormat.format(date1);
                    balance -= consume;
                    detail += note +"\t-" + consume + "\t" + time1 + "\t余额：" + balance + "\n";
                    break;
                case "4":
                    System.out.println("您确定要退出吗？y/n");
                    String key1 = "";
                    while(true) {
                        key1 = scanner.next();
                        if(key1.equals("y") || key1.equals("n")) {
                            break;
                        }
                        System.out.println("请输入正确的y/n");
                    }
                    if (key1.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        } while(loop);
        System.out.println("程序已退出!");



    }
}
