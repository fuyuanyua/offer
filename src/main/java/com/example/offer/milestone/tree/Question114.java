package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/28 21:04
 * @Description: 二叉树展开为链表：https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/
 *
 * 笔记：
 *      类型：【问题分解】
 *      也就是分解成子树问题，定义递归方法
 */

public class Question114 {

    /**
     * 方法返回值是void，说明要原地修改二叉树
     * 直接将 flatten 方法作为递归方法，首先明确方法的定义：拉平一棵树
     *      1.进入当前节点a
     *      2.将当前节点a的左子树拉平、将当前节点a的右子树拉平
     *      3.将原左子树作为右子树，将原右子树接到现左子树的后面
     * @param root
     */
    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // 将节点a的左子树拉平、将节点a的右子树拉平
        flatten(root.left);
        flatten(root.right);

        // ------ 后序位置 ------
        // 拉平后的左子树
        TreeNode left = root.left;
        // 拉平后的右子树
        TreeNode right = root.right;

        // 将原左子树作为右子树
        root.left = null;
        root.right = left;

        // 将原右子树接到现左子树的后面
        TreeNode pointer = root;
        while (pointer.right != null) {
            pointer = pointer.right;
        }
        pointer.right = right;
    }
}
