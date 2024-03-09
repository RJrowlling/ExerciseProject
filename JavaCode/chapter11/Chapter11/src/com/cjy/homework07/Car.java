package com.cjy.homework07;

/**
 * @author cjy
 * @version 1.0
 */
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (Car.this.temperature > 40) {
                System.out.println("空调吹冷气");
                return;
            }
            if (Car.this.temperature < 0) {
                System.out.println("空调吹暖气");
                return;
            }
            System.out.println("空调关闭");
        }
    }
}
