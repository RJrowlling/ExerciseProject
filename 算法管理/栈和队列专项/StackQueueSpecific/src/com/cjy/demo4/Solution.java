package com.cjy.demo4;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author cjy
 * @Date 2024/4/14 21:00
 * @Version 1.0
 * @Description: 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 */
public class Solution {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
    }
    public String removeDuplicates(String s) {
        Queue<Character> queue1 = new LinkedBlockingQueue<>();
        Queue<Character> queue2 = new LinkedBlockingQueue<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            queue1.add(s.charAt(i));
        }

        while(true) {
            Character temp = queue1.remove();


            stack.push(temp);
            if (stack.peek() == temp) {
                stack.pop();
                queue2.add(stack.pop());
                while (!queue1.isEmpty()) {
                    queue2.add(queue1.remove());
                }
                while (!queue2.isEmpty()) {
                    queue1.add(queue2.remove());
                }
            }
        }





        return null;
    }
}
