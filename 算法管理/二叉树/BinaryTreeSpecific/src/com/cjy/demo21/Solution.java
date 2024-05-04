package com.cjy.demo21;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/5/4 20:12
 * @Version 1.0
 * @Description: 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
 * 差值是一个正数，其数值等于两值之差的绝对值。
 */
public class Solution {
    public List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }

        getMinimumDifference(root.left);
        list.add(root.val);
        getMinimumDifference(root.right);

        return findMinimumDifference(list);

    }

    public static int findMinimumDifference(List<Integer> list) {
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int difference = list.get(i) - list.get(i - 1);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
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