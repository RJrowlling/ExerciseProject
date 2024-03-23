package com.cjy.code1;

import java.util.Optional;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 * @Author cjy
 * @Date 2024/3/22 20:24
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        Optional
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (hash[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
