package com.cjy.demo6;

/**
 * @Author cjy
 * @Date 2024/3/27 15:38
 * @Version 1.0
 * @Description: 7、一个普通同步方法，一个静态同步方法，同一部手机，请问先打印邮件还是短信？
 */
public class Test7 {
    public static void main(String[] args) throws InterruptedException {
        Phone7 phone = new Phone7();
        new Thread(() -> phone.sendEmail(),"A线程").start();
        Thread.sleep(1000);
        new Thread(() -> phone.cellPhone(),"B线程").start();
    }
}

class Phone7 {
    public static synchronized void sendEmail(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+":发送短信");
    }

    public synchronized void cellPhone() {
        System.out.println(Thread.currentThread().getName()+":拨打电话");
    }

    public void hello() {
        System.out.println("hello");
    }
}

