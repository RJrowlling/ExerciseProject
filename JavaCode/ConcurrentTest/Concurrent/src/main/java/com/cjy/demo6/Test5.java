package com.cjy.demo6;

/**
 * @Author cjy
 * @Date 2024/3/27 15:34
 * @Version 1.0
 * @Description: 5、两个静态同步方法，同一部手机，请问先打印邮件还是短信？
 */
public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        Phone5 phone = new Phone5();
        new Thread(() -> phone.sendEmail(),"A线程").start();
        Thread.sleep(1000);
        new Thread(() -> phone.cellPhone(),"B线程").start();
    }
}

class Phone5 {
    public static synchronized void sendEmail(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+":发送短信");
    }

    public static synchronized void cellPhone() {
        System.out.println(Thread.currentThread().getName()+":拨打电话");
    }

    public void hello() {
        System.out.println("hello");
    }
}
