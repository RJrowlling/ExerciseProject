package com.cjy.demo25;

/**
 * @Author cjy
 * @Date 2024/5/12 18:32
 * @Version 1.0
 * @Description: 给定二叉搜索树（BST）的根节点 root 和要插入树中的值 value ，将值插入二叉搜索树。 返回插入后二叉搜索树的根节
 * 点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。
 */
public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        root.left = treeNode;
        root.right = new TreeNode(7);

        Solution solution = new Solution();
        solution.insertIntoBST(root, 5);
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode treeNode = new TreeNode(val);
            return treeNode;
        }

        if (val < root.val) {
            if (root.left == null) {
                TreeNode treeNode = new TreeNode(val);
                root.left = treeNode;
            } else {
                insertIntoBST(root.left, val);
            }
        }

        if (val > root.val) {
            if (root.right == null) {
                TreeNode treeNode = new TreeNode(val);
                root.right = treeNode;
            } else {
                insertIntoBST(root.right, val);
            }
        }

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
