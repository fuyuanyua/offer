package com.example.offer.util;

import com.example.offer.datastructure.TreeNode;

/**
 * @Description: 创建树的工具类
 * @Author: lhb
 * @Date: 2021/5/27 14:59
 */

public class TreeUtil {

    /**
     * 创建一棵二叉树：
     *      3
     *     / \
     *    9   2
     *       / \
     *      1   7
     * @return
     */
    public static TreeNode createTree() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(7);
        root.setLeft(node1).setRight(node2);
        node2.setLeft(node3).setRight(node4);
        return root;
    }

    /**
     * 创建一棵空二叉树：
     *      null
     * @return
     */
    public static TreeNode createEmptyTree() {
        return null;
    }
}
