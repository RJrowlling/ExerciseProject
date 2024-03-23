package com.cjy.code2;

import java.util.*;

/**
 * 给定两个数组 nums1 和 nums2 ，返回 它们的
 * 交集
 *  。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * @Author cjy
 * @Date 2024/3/23 18:53
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        HashSet numSet= new HashSet<>(nums1.length);
        for (int i : nums1) {
            numSet.add(i);
        }
        System.out.println(numSet);
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet numSet= new HashSet<>(nums1.length);
        HashSet result= new HashSet<>(nums1.length);
        for (int i : nums1) {
            numSet.add(i);
        }

        for (int i : nums2) {
            if (numSet.contains(i)) {
                result.add(i);
            }
        }
        int[] arr = new int[result.size()];
        Object[] array = result.toArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)array[i];
        }
        return arr;

    }
}
