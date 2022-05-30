package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/30 17:11
 * @Description: 二叉搜索树中的搜索：https://leetcode.cn/problems/search-in-a-binary-search-tree/
 *
 * 笔记：
 *      类型：【二叉搜索树】
 *      历用二叉搜索树的特性，只需递归单边的子树（每次递归只递归左子树或右子树）
 */

public class Question700 {

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        // 若当前节点 > 目标值，去左子树找
        if (root.value > val) {
            return searchBST(root.left, val);
        }

        // 若当前节点 < 目标值，去右子树找
        if (root.value < val) {
            return searchBST(root.right, val);
        }

        // 若当前节点 == 目标值，返回当前节点
        return root;
    }
}
