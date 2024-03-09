package com.cjy.Extend;

public class NotePad extends Computer{
    String color;

    public NotePad(String cpu, String memory, String disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void info() {
        super.info();
        System.out.println("你的颜色为：" + this.color);
        System.out.println("________________________");
    }
}
