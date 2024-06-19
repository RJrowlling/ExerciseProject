package demo03;

import java.util.Arrays;

/**
 * @Author cjy
 * @Date 2024/6/14 20:50
 * @Version 1.0
 * @Description: 最长连续序列
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longestCount = 0;

        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                longestCount = Math.max(count, longestCount);
                count = 1;
            }
        }
        longestCount = Math.max(count, longestCount);
        return longestCount;


    }
}
