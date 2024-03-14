package com.cjy.createthread;

/**
 * @author cjy
 * @version 1.0
 */
public class create_ implements Runnable{

    @Override
    public void run() {

    }
}

class CTest {
    public static void main(String[] args) {
        Runnable runnable = new create_();
        new Thread(runnable).start();
    }
}
