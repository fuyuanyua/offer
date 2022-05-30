package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/30 20:35
 * @Description: 删除二叉搜索树中的节点：https://leetcode.cn/problems/delete-node-in-a-bst/
 *
 * 笔记：
 *      类型：【二叉搜索树】
 *      首先也要找到目标节点，再删除目标节点
 */

public class Question450 {

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        // 去左子树找
        if (root.value > key) {
            root.left = deleteNode(root.left, key);
        }
        // 去右子树找
        else if (root.value < key) {
            root.right = deleteNode(root.right, key);
        }
        // 找到目标节点，删除这个节点，以下是不同情况下用不同的操作去删除掉这个节点
        else if (root.value == key) {
            // 如果目标节点是叶子节点，直接把这个节点置为null
            if (root.left == null && root.right == null) {
                return null;
            }
            // 如果目标节点只有左子树，则返回它的左子树
            if (root.left != null && root.right == null) {
                return root.left;
            }
            // 如果目标节点只有右子树，则返回它的右子树
            if (root.right != null && root.left == null) {
                return root.right;
            }
            // 如果目标节点既有左子树也有右子树，那么应该找到右子树中最小的节点，来替代目标节点
            if (root.left != null && root.right != null) {
                TreeNode minNodeInRight = findMin(root.right);
                // 把右子树的最小节点删除，也就是这个最小节点的父节点的left指向null
                root.right = deleteNode(root.right, minNodeInRight.value);
                // 用这个右子树的最小节点替代目标节点
                minNodeInRight.left = root.left;
                minNodeInRight.right = root.right;
                root = minNodeInRight;
            }
        }

        return root;
    }

    /**
     * 从二叉搜索树中找到值最小的节点，其实就是一直找左子树，直到找到叶子节点
     * @param right
     * @return
     */
    private static TreeNode findMin(TreeNode right) {
        TreeNode p = right;
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }
}
