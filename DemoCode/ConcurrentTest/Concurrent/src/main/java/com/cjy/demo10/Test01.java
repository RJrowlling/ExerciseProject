package com.cjy.demo10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author cjy
 * @Date 2024/3/28 9:40
 * @Version 1.0
 * @Description: 练习读写锁, 我要求读操作是可以共享的读，但是写操作必须互斥的写
 */
public class Test01 {
    public static void main(String[] args) {
         LockMyCache myCache = new LockMyCache();
        //10个写线程
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            new Thread(() -> {
                myCache.put(temp + "", temp + "");
            }, "线程" + String.valueOf(i)).start();
        }
        //10个读线程
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            new Thread(() -> {
                myCache.get(temp + "");
            }, "线程" + String.valueOf(i)).start();
        }
    }
}

//没有读写锁的资源类，写入的时候，还没写入完成，会存在其他的写入！造成问题
class MyCache {
    private Map<String, String> map = new HashMap<>();

    //写操作
    public void put(String key, String value) {
        System.out.println(Thread.currentThread().getName() + " 执行写操作");
        map.put(key, value);
        System.out.println(Thread.currentThread().getName() + " 写操作完毕");
    }

    //读操作
    public void get(String key) {
        System.out.println(Thread.currentThread().getName() + " 执行读操作");
        map.get(key);
        System.out.println(Thread.currentThread().getName() + " 读操作完毕");
    }
}

class LockMyCache {
    private volatile Map<String,String> map = new HashMap<>();
    //定义读写锁
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    //写操作，上写锁
    public void put(String key, String value) {
        readWriteLock.writeLock().lock();//上写锁
        try {
            System.out.println(Thread.currentThread().getName() + " 执行写操作");
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + " 写操作完毕");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    //读操作，上读锁
    public void get(String key) {
        readWriteLock.readLock().lock();//上读锁
        try {
            System.out.println(Thread.currentThread().getName() + " 执行读操作");
            map.get(key);
            System.out.println(Thread.currentThread().getName() + " 读操作完毕");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

}
