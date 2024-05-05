package com.cjy.demo22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author cjy
 * @Date 2024/5/5 19:22
 * @Version 1.0
 * @Description: 给你一个含重复值的二叉搜索树（BST）的根节点 root ，找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
 * 如果树中有不止一个众数，可以按 任意顺序 返回。
 * 假定 BST 满足如下定义：
 *     结点左子树中所含节点的值 小于等于 当前节点的值
 *     结点右子树中所含节点的值 大于等于 当前节点的值
 *     左子树和右子树都是二叉搜索树
 */
public class Solution {
    public List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return null;
        }
        findMode(root.left);
        list.add(root.val);
        findMode(root.right);

        return findModes(list);

    }

    public static int[] findModes(List<Integer> list) {
        if (list.isEmpty()) {
            return new int[0];
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;

        // 计算每个元素出现的次数
        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, countMap.get(num));
        }

        // 找到所有的众数
        ArrayList<Integer> modesList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modesList.add(entry.getKey());
            }
        }

        // 转换为数组返回
        int[] modes = new int[modesList.size()];
        for (int i = 0; i < modesList.size(); i++) {
            modes[i] = modesList.get(i);
        }
        return modes;
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
