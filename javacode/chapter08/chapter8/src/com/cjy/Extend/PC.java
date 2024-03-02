package com.cjy.Extend;

public class PC extends Computer{
    String brand;

    public PC(String cpu, String memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void info() {
        super.info();
        System.out.println("你的品牌为：" + this.brand);
        System.out.println("________________________");
    }


}
