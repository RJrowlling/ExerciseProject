package com.cjy.demo6;

/**
 * @Author cjy
 * @Date 2024/3/27 15:26
 * @Version 1.0
 * @Description: 2、邮件方法暂停4秒钟，请问先打印邮件还是短信？
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Phone2 phone = new Phone2();
        new Thread(() -> phone.sendEmail(),"A线程").start();
        Thread.sleep(1000);
        new Thread(() -> phone.cellPhone(),"B线程").start();
    }
}

class Phone2 {
    public synchronized void sendEmail(){
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
}

