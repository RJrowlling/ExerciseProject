package com.cjy.homework04;

/**
 * @author cjy
 * @version 1.0
 */
public class JudgeStr {
    public static void main(String[] args) {
        String str = "abcd1234EFGH";
        judge(str);
    }

    public static void judge(String str) {
        int numCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                numCount++;
                continue;
            }
            if(Character.isUpperCase(str.charAt(i))) {
                upperCount++;
                continue;
            }
            if(Character.isLowerCase(str.charAt(i))) {
                lowerCount++;
            }
        }
        System.out.println(String.format("数字有%d个", numCount));
        System.out.println(String.format("大写字母有%d个", lowerCount));
        System.out.println(String.format("小写字母有%d个", lowerCount));
    }
}
