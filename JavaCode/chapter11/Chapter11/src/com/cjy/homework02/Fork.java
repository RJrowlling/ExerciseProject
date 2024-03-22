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

    public Fork test() {
        return null;
    }


}

class a {

}

class b extends a {

}

class e extends b {

}

class c {
    public a test() {
        return null;
    }
    public static void hello() {
        System.out.println();
    }
}

class d extends c {
    @Override
    public b test() {
        return null;
    }

}
