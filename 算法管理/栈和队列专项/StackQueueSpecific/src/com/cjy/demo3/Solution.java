package com.cjy.demo3;

import java.util.Stack;

/**
 * @Author cjy
 * @Date 2024/4/14 20:28
 * @Version 1.0
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 */
public class Solution {

    public static void main(String[] args) {
        String s = "[{]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                stack.push(temp);
                continue;
            }

            if (temp == ')') temp = '(';
            if (temp == ']') temp = '[';
            if (temp == '}') temp = '{';
            if (stack.isEmpty() || stack.peek() != temp) {
                return false;
            }
            stack.pop();
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }




    }
}
