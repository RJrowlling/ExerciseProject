package com.cjy.demo08;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author cjy
 * @Date 2024/4/19 18:34
 * @Version 1.0
 * @Description: 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。(层序遍历)
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        int depth = 0;
        queue.add(root);

        while(queue.size() > 0) {
            int size = queue.size();
            while (size > 0) {
                TreeNode remove = queue.remove();
                if (remove.left != null) {
                    queue.add(remove.left);
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                }
                size--;
            }
            depth++;
        }
        return depth;
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