package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/29 22:19
 * @Description: 二叉搜索树中第K小的元素：https://leetcode.cn/problems/kth-smallest-element-in-a-bst/
 *
 * 笔记：
 *      类型：【二叉搜索树】
 *      中序遍历BST，得到升序序列，遍历到第k个节点就是第k小的元素
 */

public class Question230 {

    // 表示遍历到第几个节点
    private static int count = 0;

    // 记录第k小的元素的值
    private static int value = 0;

    public static int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return value;
    }

    private static void inorder(TreeNode root, int k) {
        // base case
        if (root == null) {
            return;
        }

        inorder(root.left, k);

        // 中序位置
        count++;
        if (count == k) {
            value = root.value;
            return;
        }

        inorder(root.right, k);
    }
}
