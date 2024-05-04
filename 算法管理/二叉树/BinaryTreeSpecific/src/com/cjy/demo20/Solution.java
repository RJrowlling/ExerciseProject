package com.cjy.demo20;

import java.util.ArrayList;

/**
 * @Author cjy
 * @Date 2024/5/4 19:24
 * @Version 1.0
 * @Description: 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *    有效 二叉搜索树定义如下：
 *     节点的左子树只包含 小于 当前节点的数。
 *     节点的右子树只包含 大于 当前节点的数。
 *     所有左子树和右子树自身必须也是二叉搜索树。
 */
public class Solution {
    public ArrayList<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        isValidBST(root.left);
        list.add(root.val);
        isValidBST(root.right);

        return isSorted(list);
    }

    public static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false; // 如果发现不按顺序，立即返回false
            }
        }
        return true; // 如果遍历完成没有返回false，则返回true
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
