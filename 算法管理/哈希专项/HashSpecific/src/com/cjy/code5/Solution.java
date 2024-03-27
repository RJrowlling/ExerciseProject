package com.cjy.code5;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author cjy
 * @Date 2024/3/27 20:01
 * @Version 1.0
 * @Description: 给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {-1, -1};
        int[] nums2 = {-1, 1};
        int[] nums3 = {-1, 1};
        int[] nums4 = {1, -1};
    }


    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int k : nums1) {
            for (int i : nums2) {
                int temp = k + i;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }

        for (int k : nums3) {
            for (int i : nums4) {
                int temp = -k - i;
                count += map.getOrDefault(temp, 0);
            }
        }

        return count;
    }
}
