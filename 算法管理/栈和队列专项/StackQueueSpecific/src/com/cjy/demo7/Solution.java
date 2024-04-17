package com.cjy.demo7;

import java.util.*;

/**
 * @Author cjy
 * @Date 2024/4/17 17:03
 * @Version 1.0
 * @Description: 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int[] ints = topKFrequent(nums,2);
        System.out.println(ints);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        //大顶堆
        Queue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);

        //map添加映射
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //将map中的数据导入queue
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            int[] temp = {key,count};
            queue.add(temp);
        }

        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            int[] poll = queue.poll();
            array[i] = poll[0];
        }

        return array;
    }
}
