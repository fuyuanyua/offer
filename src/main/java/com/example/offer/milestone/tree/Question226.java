package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/28 18:21
 * @Description: 翻转二叉树：https://leetcode.cn/problems/invert-binary-tree/
 *
 * 笔记：
 *      类型：【递归-前序位置】
 */

public class Question226 {

    public static TreeNode invertTree(TreeNode root) {
        traverse(root);
        return root;
    }

    private static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        // 前序位置
        // 交换当前节点的左右子树
        // ps：这段逻辑放到后序位置，也同样可以实现功能
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        traverse(root.left);
        traverse(root.right);
    }
}
