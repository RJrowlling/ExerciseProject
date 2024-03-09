package com.cjy.inner_;

public class Test {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课啦");
            }
        });

    }
}
