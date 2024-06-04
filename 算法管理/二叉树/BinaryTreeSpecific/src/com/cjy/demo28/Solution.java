package com.cjy.demo28;

import java.util.Arrays;

/**
 * @Author cjy
 * @Date 2024/6/4 20:13
 * @Version 1.0
 * @Description: 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵平衡二叉搜索树。
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int mid = nums.length / 2;
        int[] leftNums = Arrays.copyOfRange(nums, 0, mid);
        int[] rightNums = Arrays.copyOfRange(nums, mid + 1, nums.length);

        TreeNode midNode = new TreeNode(nums[mid]);
        TreeNode leftNode =  sortedArrayToBST(leftNums);
        TreeNode rightNode = sortedArrayToBST(rightNums);

        midNode.left = leftNode;
        midNode.right = rightNode;

        return midNode;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
