package com.concurrrent.demo1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author cjy
 * @Date 2024/3/30 14:20
 * @Version 1.0
 * @Description: 注意，这里500个线程执行完才能打印count结果，因为有countDownLatch，
 * 但是访问的count这个共享的变量，没有做同步处理
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        TestCount testCount = new TestCount();
        final int threadSize = 500;

        CountDownLatch countDownLatch = new CountDownLatch(threadSize);

        //遇强则强
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                testCount.add();
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        testCount.show();
        executorService.shutdown();

    }
}

class TestCount {
    private AtomicInteger count = new AtomicInteger(0);

    public void add() {
        count.getAndIncrement();
    }
    public void show() {
        System.out.println(count.get());
    }
}
