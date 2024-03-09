package com.cjy.homework01;

/**
 * @author cjy
 * @version 1.0
 */
public class ReverseString {
    public static void main(String[] args) {
        String a = "abcdefgh";
        System.out.println(reverse(a,0,4));
    }

    public static String reverse(String str, int start, int end) {
        String subStr = str.substring(start,end);
        String subResStr = "";
        for (int i = 0; i < subStr.length(); i++) {
            subResStr = subStr.charAt(i) + subResStr;
        }
        return str.replace(subStr,subResStr);
    }
}


