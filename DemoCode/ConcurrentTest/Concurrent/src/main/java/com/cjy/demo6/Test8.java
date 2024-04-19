package com.cjy.demo6;

/**
 * @Author cjy
 * @Date 2024/3/27 15:39
 * @Version 1.0
 * @Description: 8、一个普通同步方法，一个静态同步方法，2部手机，请问先打印邮件还是短信？
 */
public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        Phone8 phone_1 = new Phone8();
        Phone8 phone_2 = new Phone8();


        new Thread(() -> phone_1.sendEmail(),"A线程").start();
        Thread.sleep(1000);
        new Thread(() -> phone_2.cellPhone(),"B线程").start();
    }
}

class Phone8 {
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