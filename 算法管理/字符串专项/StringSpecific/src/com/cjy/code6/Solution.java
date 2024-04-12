package com.cjy.code6;

/**
 * @Author cjy
 * @Date 2024/4/10 14:06
 * @Version 1.0
 * @Description: 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 */
public class Solution {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
        label1:
        for (int i = 0; i < s.length() / 2; i++) {
            String subString = s.substring(0, i + 1);
            int subLength = i + 1;

            if (s.length() % subLength != 0) {
                continue;
            }

            for (int j = 1; j < s.length() / subLength; j++) {
                String tempString = s.substring((i + 1) * j, (i + 1) * (j + 1));
                if (!subString.equals(tempString)) {
                   continue label1;
                }
            }
            return true;
        }
        return false;
    }
}
