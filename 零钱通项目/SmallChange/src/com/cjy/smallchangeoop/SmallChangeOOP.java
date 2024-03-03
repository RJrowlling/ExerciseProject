package com.cjy.smallchangeoop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    private boolean loop = true;
    private String key = "";
    private double balance = 0;
    private String detail = "";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Scanner scanner = new Scanner(System.in);

    public void changeMenu() {
        do {
            System.out.println("============零钱通菜单============");
            System.out.println("         1 零钱通明细");
            System.out.println("         2 收益  入账");
            System.out.println("         3 消     费");
            System.out.println("         4 退     出");
            System.out.println("请选择（1-4）：");
            this.key = scanner.next();

            switch (this.key) {
                case "1":
                    this.changeDetail();
                    break;
                case "2":
                    this.enterChange();
                    break;
                case "3":
                    this.consumeChange();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        } while(this.loop);
        System.out.println("程序已退出!");
    }

    public void changeDetail() {
        System.out.println(this.detail);
    }

    public void enterChange() {
        System.out.println("请输入你的入账金额：");
        double temp = scanner.nextDouble();
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        this. balance += temp;
        this.detail += "收益入账\t" + "+" + temp + "\t" + time + "\t余额：" + this.balance + "\n";
    }

    public void consumeChange() {
        System.out.println("请输入你的消费项目：");
        String note = scanner.next();
        System.out.println("请输入你的消费金额：");
        double consume = scanner.nextDouble();
        if (consume > this.balance) {
            System.out.println("您的消费"+ consume +"大于您的余额"+ this.balance +"，不能消费");
            return;
        }
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        this.balance -= consume;
        this.detail += note +"\t-" + consume + "\t" + time + "\t余额：" + this.balance + "\n";
    }

    public void exit() {
        System.out.println("您确定要退出吗？y/n");
        String key = "";
        while(true) {
            key = scanner.next();
            if(key.equals("y") || key.equals("n")) {
                break;
            }
            System.out.println("请输入正确的y/n");
        }
        if (key.equals("y")) {
            this.loop = false;
        }
    }
}
