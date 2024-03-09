package com.cjy.code1;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
 * @author cjy
 * @version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search2(nums,0));
    }

    //左闭右闭
    public static int search1(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int middle;
        while (left <= right) {
            middle = (left+right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
                continue;
            }
            if (nums[middle] < target) {
                left = middle + 1;
                continue;
            }
            return middle;
        }
        return -1;
    }

    //左闭右开
    public static int search2(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        int middle;
        while (left < right) {
            middle = (left+right) / 2;
            if (nums[middle] > target) {
                right = middle;
                continue;
            }
            if (nums[middle] < target) {
                left = middle + 1;
                continue;
            }
            return middle;
        }
        return -1;
    }

}
