package com.cjy.demo26;

/**
 * @Author cjy
 * @Date 2024/5/12 18:57
 * @Version 1.0
 * @Description: 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。
 * 返回二叉搜索树（有可能被更新）的根节点的引用。
 * 一般来说，删除节点可分为两个步骤：
 * 首先找到需要删除的节点；
 * 如果找到了，删除它。
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(6);
        treeNode1.right = new TreeNode(7);
        root.left = treeNode;
        root.right = treeNode1;

        Solution solution = new Solution();
        solution.deleteNode(new TreeNode(0), 0);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key == root.val) {
            if (root.left == null && root.right == null) {
                root = null;
                return root;
            }
            if (root.left != null && root.right != null) {
                TreeNode cur = root.right;
                while (cur.left != null) {
                    cur = cur.left;
                }
                cur.left = root.left;
                root = root.right;
                return root;
            }
            if (root.left != null) {
                root = root.left;
                return root;
            }
            if (root.right!= null) {
                root = root.right;
                return root;
            }
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
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