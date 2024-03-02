package com.cjy.Extend;

public class Computer {
    String cpu;
    String memory;
    String disk;

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void info() {
        System.out.println("你的cpu为：" + this.cpu);
        System.out.println("你的内存为：" + this.memory);
        System.out.println("你的硬盘为：" + this.disk);
    }
}
