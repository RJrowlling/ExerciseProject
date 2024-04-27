package com.cjy.demo17;

/**
 * @Author cjy
 * @Date 2024/4/27 20:46
 * @Version 1.0
 * @Description: 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 *     创建一个根节点，其值为 nums 中的最大值。
 *     递归地在最大值 左边 的 子数组前缀上 构建左子树。
 *     递归地在最大值 右边 的 子数组后缀上 构建右子树。
 *
 * 返回 nums 构建的 最大二叉树 。
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaxBinaryTree(nums, 0, nums.length);
    }

    public TreeNode constructMaxBinaryTree(int[] nums, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex < 1) {
            return null;
        }
        if (rightIndex - leftIndex == 1) {
            return new TreeNode(nums[leftIndex]);
        }

        int maxValIndex = leftIndex;
        int maxVal = nums[maxValIndex];
        for (int i = leftIndex + 1; i < rightIndex; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxValIndex = i;
            }
        }
        TreeNode root = new TreeNode(maxVal);
        root.left = constructMaxBinaryTree(nums, leftIndex, maxValIndex);
        root.right = constructMaxBinaryTree(nums, maxValIndex + 1, rightIndex);
        return root;

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
