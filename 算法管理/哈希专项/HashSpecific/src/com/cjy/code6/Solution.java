package com.cjy.code6;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author cjy
 * @Date 2024/3/28 16:57
 * @Version 1.0
 * @Description: 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 */
public class Solution {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        canConstruct(ransomNote,magazine);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
