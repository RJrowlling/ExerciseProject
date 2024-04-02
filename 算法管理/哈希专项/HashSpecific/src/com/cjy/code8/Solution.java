package com.cjy.code8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/2 19:23
 * @Version 1.0
 * @Description: 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件
 * 且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            //一级剪枝
            if (nums[i] > 0 && nums[i] > target) {
                return list;
            }
            //一级去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                //二级去重
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                while (right > left) {
                    int temp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (temp > target) {
                        right--;
                    } else if (temp < target) {
                        left++;
                    } else {
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        right--;
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
