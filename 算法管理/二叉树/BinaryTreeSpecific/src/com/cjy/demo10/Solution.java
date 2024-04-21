package com.cjy.demo10;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/21 18:21
 * @Version 1.0
 * @Description: 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2, treeNode3, null);
        TreeNode treeNode1 = new TreeNode(1, null, treeNode2);
        Solution solution = new Solution();
        System.out.println(solution.countNodes(treeNode1));
    }
    public int countNodes(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        int size = list.size();
        return size;
    }

    public void preorder(TreeNode node,List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preorder(node.left,list);
        preorder(node.right,list);
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