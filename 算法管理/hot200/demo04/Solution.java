package demo04;

import java.util.Arrays;

/**
 * @Author cjy
 * @Date 2024/6/15 19:32
 * @Version 1.0
 * @Description: 移动零， 编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,6,5,0,0,1,3};
        moveZeroes(nums);

    }
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
