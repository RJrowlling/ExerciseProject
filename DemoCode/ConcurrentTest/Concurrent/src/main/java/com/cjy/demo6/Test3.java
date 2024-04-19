package com.cjy.demo6;

/**
 * @Author cjy
 * @Date 2024/3/27 15:29
 * @Version 1.0
 * @Description: 3、新增一个普通方法hello()没有同步,请问先打印邮件还是hello？
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Phone3 phone = new Phone3();
        new Thread(() -> phone.sendEmail(),"A线程").start();
        Thread.sleep(1000);
        new Thread(() -> phone.hello(),"B线程").start();
    }
}

class Phone3 {
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

    public void hello() {
        System.out.println("hello");
    }
}


