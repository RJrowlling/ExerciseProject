package com.cjy.demo2;

import java.util.Queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author cjy
 * @Date 2024/4/14 19:50
 * @Version 1.0
 * @Description: 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 */
public class MyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());

    }

    private Queue<Object> queue1;
    private Queue<Object> queue2;

    public MyStack() {
        queue1 = new LinkedBlockingQueue<>();
        queue2 = new LinkedBlockingQueue<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        int size = queue1.size();
        int ret = 0;
        for (int i = 0; i < size; i++) {
            if (i == size-1) {
                ret = (int) queue1.remove();
                break;
            }
            queue2.add(queue1.remove());
        }
        while(!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
        return ret;
    }

    public int top() {
        int size = queue1.size();
        int ret = 0;
        for (int i = 0; i < size; i++) {
            if (i == size-1) {
                ret = (int) queue1.remove();
                queue2.add(ret);
                break;
            }
            queue2.add(queue1.remove());
        }
        while(!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
        return ret;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
