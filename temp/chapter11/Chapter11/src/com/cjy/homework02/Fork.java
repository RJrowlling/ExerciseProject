package com.cjy.homework02;

/**
 * @author cjy
 * @version 1.0
 */
public class Fork {
    private static int currentNum = 100000;
    private int serialNumber;

    public Fork() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}
