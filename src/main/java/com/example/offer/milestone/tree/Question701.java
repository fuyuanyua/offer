package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/30 18:16
 * @Description: 二叉搜索树中的插入操作：https://leetcode.cn/problems/insert-into-a-binary-search-tree/
 *
 * 笔记：
 *      类型：【二叉搜索树】
 *      相比较Question700：二叉搜索树中的搜索
 *      此题思路大致相同，首先要找到 node 应该插入的位置，然后新建 node 返回
 */

public class Question701 {

    /**
     * 所有值 Node.val 是 独一无二 的。
     * 保证 val 在原始 BST 中不存在。
     * @param root
     * @param val
     * @return
     */
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        // base case，找到了合适位置，插入新元素
        if (root == null) {
            return new TreeNode(val);
        }

        // 若当前节点 > 目标值，去左子树找
        if (root.value > val) {
            root.left = insertIntoBST(root.left, val);
        }

        // 若当前节点 < 目标值，去右子树找
        if (root.value < val) {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
