package com.cjy.homework07;

/**
 * @author cjy
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(20);
        Car car2 = new Car(-10);
        Car car3 = new Car(50);

        car1.new Air().flow();
        car2.new Air().flow();
        car3.new Air().flow();
    }
}
