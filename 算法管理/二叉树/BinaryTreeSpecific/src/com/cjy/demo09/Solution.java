package com.cjy.demo09;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author cjy
 * @Date 2024/4/19 18:56
 * @Version 1.0
 * @Description: 给定一个二叉树，找出其最小深度。最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root ==null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        int depth = 0;

        queue.add(root);

        while (queue.size() > 0) {
            int size = queue.size();
            depth++;
            while (size > 0) {
                TreeNode remove = queue.remove();
                if (remove.left == null && remove.right == null) {
                    return depth;
                }
                if (remove.left != null) {
                    queue.add(remove.left);
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                }
                size--;
            }
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