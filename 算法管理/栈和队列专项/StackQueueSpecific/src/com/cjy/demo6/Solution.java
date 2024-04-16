package com.cjy.demo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author cjy
 * @Date 2024/4/16 20:05
 * @Version 1.0
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] ints = solution.maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(ints));
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        int[] array = new int[nums.length - k +1];
        int count = 0;
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }

        array[count++] = maxQueue(queue);

        for (int i = k; i < nums.length; i++) {
            queue.poll();
            queue.add(nums[i]);
            array[count++] = maxQueue(queue);
        }
        return array;
    }

    public int maxQueue(Queue<Integer> queue) {
        int max = Integer.MIN_VALUE;
        Queue<Integer> tempQueue = new LinkedBlockingQueue<>(queue);
        while (!tempQueue.isEmpty()) {
            int value = tempQueue.remove();
            max = Math.max(value,max);
        }
        return max;
    }
}
