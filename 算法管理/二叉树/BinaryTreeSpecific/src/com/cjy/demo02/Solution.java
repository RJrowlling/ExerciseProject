package com.cjy.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/17 21:26
 * @Version 1.0
 * @Description: 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2, treeNode3, null);
        TreeNode treeNode1 = new TreeNode(1, null, treeNode2);
        Solution solution = new Solution();
        System.out.println(solution.preorderTraversal(treeNode1));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        ergodic(root,result);
        return result;
    }

    public void ergodic(TreeNode root,List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        ergodic(root.left,list);
        ergodic(root.right,list);
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
