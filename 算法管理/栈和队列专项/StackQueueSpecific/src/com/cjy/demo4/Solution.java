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
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        String result = "";

        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }
}
