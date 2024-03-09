package com.cjy.homework06;

/**
 * @author cjy
 * @version 1.0
 */
public class Person {
    String name;
    Vehicles vehicles;

    public Person(String name, String keys) {
        this.name = name;
        System.out.print("我是"+this.name);
        if (keys.equals("一般情况")) {
            this.vehicles = new Horse();
            this.vehicles.work();
        }
        if (keys.equals("大河")) {
            this.vehicles = new Boat();
            this.vehicles.work();
        }
    }
}
