package com.cjy.createthread;

import com.sun.corba.se.impl.orbutil.closure.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author cjy
 * @version 1.0
 */
public class Callable_ {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(stringFutureTask);
        thread.start();

        String s = stringFutureTask.get();
    }
}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("您好");
        return "您好";
    }
}
