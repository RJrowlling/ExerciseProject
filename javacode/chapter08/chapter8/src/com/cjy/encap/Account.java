package com.cjy.encap;

public class Account {
    private String name;
    private double money;
    private String password;

    public Account(String name, double money, String password) {
        setName(name);
        setMoney(money);
        setPassword(password);
    }

    public void info() {
        System.out.println("你的姓名为："+this.name+" 你的钱为："+this.money+" 你的密码为："+this.password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1 && name.length() < 5) {
            this.name = name;
        } else {
            System.out.println("你的姓名应该在2位3位或4位，已将您的姓名默认为：无名氏");
            this.name = "无名氏";
        }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money > 20) {
            this.money = money;
        } else {
            System.out.println("你的钱应该大于20，已将您的钱默认为：0");
            this.money = 0;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("你的密码应该是6位，已将您的密码默认为：000000");
            this.password = "000000";
        }

    }
}
