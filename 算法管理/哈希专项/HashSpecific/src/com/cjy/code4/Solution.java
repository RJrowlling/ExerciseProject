package com.cjy.code4;

import java.util.HashMap;

/**
 * @Author cjy
 * @Date 2024/3/26 20:17
 * @Version 1.0
 * @Description: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，
 * 并返回它们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            if (map.containsKey(s)) {
                res[0] = i;
                res[1] = map.get(s);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
