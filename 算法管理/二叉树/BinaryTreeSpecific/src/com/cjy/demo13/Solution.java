package com.cjy.demo13;

/**
 * @Author cjy
 * @Date 2024/4/26 17:09
 * @Version 1.0
 * @Description: 给定二叉树的根节点 root ，返回所有左叶子之和。
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSumOfLeftLeaves = sumOfLeftLeaves(root.left);
        int rightSumOfLeftLeaves = sumOfLeftLeaves(root.right);

        int sumOfLeftLeaves = 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sumOfLeftLeaves += root.left.val;
        }
        sumOfLeftLeaves = leftSumOfLeftLeaves + rightSumOfLeftLeaves + sumOfLeftLeaves;
        return sumOfLeftLeaves;
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