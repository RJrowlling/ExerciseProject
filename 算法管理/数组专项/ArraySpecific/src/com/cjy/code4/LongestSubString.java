package com.cjy.code4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组
 *  [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * @author cjy
 * @version 1.0
 */
public class LongestSubString {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(lengthOfLongestSubstring(nums,target));

    }
    public static int lengthOfLongestSubstring(int[] nums, int target) {
        int i = 0;
        int sum = 0;
        int result = nums.length;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                sum -= nums[i];
                result = Math.min((j-i+1), result);
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        return result;
    }
}
