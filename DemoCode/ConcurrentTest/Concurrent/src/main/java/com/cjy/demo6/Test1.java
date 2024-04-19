package com.cjy.demo6;

/**
 * @Author cjy
 * @Date 2024/3/27 15:19
 * @Version 1.0
 * @Description: 1、标准访问，请问先打印邮件还是短信？
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Phone1 phone = new Phone1();
        new Thread(() -> phone.sendEmail(),"A线程").start();
        Thread.sleep(1000);
        new Thread(() -> phone.cellPhone(),"B线程").start();
    }
}

class Phone1 {
    public synchronized void sendEmail() {
        System.out.println(Thread.currentThread().getName()+":发送短信");
    }

    public synchronized void cellPhone() {
        System.out.println(Thread.currentThread().getName()+":拨打电话");
    }
}
