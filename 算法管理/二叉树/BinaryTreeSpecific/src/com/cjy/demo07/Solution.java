package com.cjy.demo07;

/**
 * @Author cjy
 * @Date 2024/4/19 18:13
 * @Version 1.0
 * @Description: 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        Boolean flag = compare(root.left, root.right);
        return flag;
    }

    public Boolean compare(TreeNode leftSubTree, TreeNode rightSubTree) {
        if (leftSubTree == null && rightSubTree == null) {
            return true;
        }
        if (leftSubTree != null && rightSubTree == null) {
            return false;
        }
        if (leftSubTree == null && rightSubTree != null) {
            return false;
        }
        if (leftSubTree.val != rightSubTree.val) {
            return false;
        }
        //比较外侧
        Boolean outsideFlag = compare(leftSubTree.left, rightSubTree.right);
        //比较内侧
        Boolean insideFlag = compare(leftSubTree.right, rightSubTree.left);

        return outsideFlag && insideFlag;
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
