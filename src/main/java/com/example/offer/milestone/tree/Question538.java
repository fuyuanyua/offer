package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/30 15:38
 * @Description: 把二叉搜索树转换为累加树：https://leetcode.cn/problems/convert-bst-to-greater-tree/
 *
 * 笔记：
 *      类型：【二叉搜索树】
 *      累加树是指把每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 *      我们新定义一种【反向中序遍历】：右-根-左，那么根据二叉搜索树的特性，得到的就是【降序】的有序序列
 */

public class Question538 {

    // 用于记录降序序列元素和
    private static int sum = 0;

    public static TreeNode convertBST(TreeNode root) {
        myInorder(root);
        return root;
    }

    /**
     * 自定义的中序遍历：右-根-左，那么得到的就是降序序列
     * @param root
     */
    private static void myInorder(TreeNode root) {
        // base case
        if (root == null) {
            return;
        }

        // 先遍历右子树
        myInorder(root.right);

        // 中序位置
        sum += root.value;
        root.value = sum;

        // 再遍历左子树
        myInorder(root.left);
    }
}
