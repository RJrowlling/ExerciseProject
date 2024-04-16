package com.cjy.demo5;

import java.sql.SQLOutput;
import java.util.Stack;

/**
 * @Author cjy
 * @Date 2024/4/16 19:10
 * @Version 1.0
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(solution.evalRPN(tokens));


    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();

        for (String s : tokens) {
            try {
                numStack.push(Integer.valueOf(s));
            } catch (NumberFormatException e) {
                Integer operand2 = numStack.pop();
                Integer operand1 = numStack.pop();
                numStack.push(compute(operand1,s,operand2));
            }
        }

        return numStack.pop();
    }

    public boolean isDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public Integer compute(Integer operand1, String operator, Integer operand2) {
        Integer result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
        }
        return result;
    }
}
