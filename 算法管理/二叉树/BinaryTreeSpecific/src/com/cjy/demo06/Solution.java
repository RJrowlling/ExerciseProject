package com.cjy.demo06;

/**
 * @Author cjy
 * @Date 2024/4/18 18:34
 * @Version 1.0
 * @Description:
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        swapChildNode(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public void swapChildNode(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
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
