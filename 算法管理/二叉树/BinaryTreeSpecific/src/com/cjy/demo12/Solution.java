package com.cjy.demo12;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/21 18:53
 * @Version 1.0
 * @Description: 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 */
public class Solution {
    public static void main(String[] args) {
        String a = "abcdef";
        System.out.println(a.substring(0,a.length() - 2));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return null;
        }
        List<Integer> path = new ArrayList<>();
        preorder(root, result, path);
        return result;

    }

    public void preorder(TreeNode node, List<String> result, List<Integer> path) {
        path.add(node.val);

        if (node.left == null && node.right == null) {
            String res = "";
            for (int i = 0; i < path.size(); i++) {
                res = res + path.get(i) + "->";
            }
            res = res.substring(0,res.length() - 2);
            result.add(res);
            return;
        }

        if (node.left != null) {
            preorder(node.left,result,path);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            preorder(node.right,result,path);
            path.remove(path.size() - 1);
        }

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
