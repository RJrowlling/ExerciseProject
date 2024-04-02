package com.cjy.code7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @Author cjy
 * @Date 2024/3/30 20:04
 * @Version 1.0
 * @Description: 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
 * 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0
 * 你返回所有和为 0 且不重复的三元组。注意：答案中不可以包含重复的三元组。
 */
public class Solution {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer
        int[] nums = {0,0,0};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        if (nums[0] > 0) {
            return list;
        }

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

                while (left < right) {
                    int temp = nums[i] + nums[left] + nums[right];
                    if (temp > 0) {
                        right--;
                    } else if (temp < 0) {
                        left++;
                    } else {
                        list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while (nums[right] == nums[right - 1] && left < right) {
                            right--;
                        }
                        while (nums[left] == nums[left + 1] && left < right) {
                            left++;
                        }
                        left++;
                        right--;
                    }
                }
        }
        return list;
    }
}


