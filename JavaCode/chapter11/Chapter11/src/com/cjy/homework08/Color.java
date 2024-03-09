package com.cjy.homework08;

/**
 * @author cjy
 * @version 1.0
 */
public enum Color implements ShowColor{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    int redValue;
    int greenValue;
    int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(this);
        System.out.println("blueValue："+this.blueValue);
        System.out.println("redValue："+this.redValue);
        System.out.println("greenValue："+this.greenValue);
    }
}
