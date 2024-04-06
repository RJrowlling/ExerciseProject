package com.cjy.code2;

/**
 * @Author cjy
 * @Date 2024/4/6 19:33
 * @Version 1.0
 * @Description: 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 1));
    }

    public static String reverseStr(String s, int k) {
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        //如果k大于或等于s的长度，则全部反转,并直接返回
        if (k >= s.length()) {
            reverseString(charArray,0,charArray.length);
            return gainString(charArray);
        }

        int start = 0;
        int end = k;
        int residualLength = s.length();
        do {
            //反转这 2k 字符中的前 k 个字符
            reverseString(charArray,start,end);

            //剩余的长度
            residualLength -= 2 * k;

            //如果剩余字符少于 k 个，则将剩余字符全部反转
            if (residualLength < k) {
                reverseString(charArray,s.length() - residualLength,s.length());
                return gainString(charArray);
            }

            //如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
            if (residualLength < 2 * k && residualLength >= k) {
                reverseString(charArray,s.length() - residualLength,s.length() - residualLength + k);
                return gainString(charArray);
            }

            start += 2 * k;
            end += 2 * k;

        } while (true);

    }

    public static void reverseString(char[] s, int start, int end) {
        char temp;
        for (int i = start; i < start + (end - start) / 2; i++) {
            temp = s[i];
            int rightIndex = end - 1 - (i - start);
            s[i] = s[rightIndex];
            s[rightIndex] = temp;
        }
    }

    public static String gainString(char[] c) {
        String result = "";
        for (char s : c) {
            result += s;
        }
        return result;
    }
}
