package com.cjy.demo1;

import java.util.Stack;

/**
 * @Author cjy
 * @Date 2024/4/13 18:56
 * @Version 1.0
 * @Description:
 */
public class MyQueue {
    private Stack<Object> stack1;
    private Stack<Object> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        Object pop = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return (int) pop;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        Object peek = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return (int) peek;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
