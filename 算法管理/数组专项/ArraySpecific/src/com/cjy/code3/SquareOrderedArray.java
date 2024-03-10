package com.cjy.code3;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * @author cjy
 * @version 1.0
 */
public class SquareOrderedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
//        sortedSquares1(nums);
        int[] result = sortedSquares(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }

    }
    //先平方，后用冒泡排序，时间复杂度高，但是是原地排序
    public static int[] sortedSquares1 (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    //双指针的思路，时间复杂度低，但是多用了一个result数组
    public static int[] sortedSquares (int[] nums) {
        int[] result = new int[nums.length];
        int k = nums.length - 1;
        for (int i = 0,j = nums.length - 1; i <= j; ) {
            if (nums[i]*nums[i] > nums[j]*nums[j]) {
                result[k--] = nums[i]*nums[i];
                i++;
            } else {
                result[k--] = nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
}
