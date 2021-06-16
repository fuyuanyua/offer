package com.example.offer.util;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.question.tree.easy.Question55P1;

import java.util.Random;

/**
 * @Description: 树相关的工具类
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

    /**
     * 创建一棵二叉搜索树：
     *      5
     *     / \
     *    3   7
     *   / \ / \
     *  2  4 6  8
     * @return
     */
    public static TreeNode createBinarySearchTree() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(8);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node2.setLeft(node5).setRight(node6);
        return root;
    }

    /**
     * 创建一棵平衡二叉树
     *          1
     *         / \
     *        1   1
     *       / \
     *      1   1
     * @return
     */
    public static TreeNode creatBalancedBinaryTree() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        return root;
    }

    /**
     * 创建一棵非平衡二叉树
     *          1
     *         / \
     *        1   1
     *       / \
     *      1   1
     *     /
     *    1
     * @return
     */
    public static TreeNode creatUnbalancedBinaryTree() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node3.setLeft(node5);
        return root;
    }

    /**
     * 随机返回根节点的一个子节点，或根节点本身
     * @param root
     * @return
     */
    public static TreeNode getRandomChildNode(TreeNode root) {
        if (root == null) {
            return null;
        }

        // 树的深度
        int depth = Question55P1.solution3(root);
        long currentTimeMillis = 0L;

        // 随机数取值范围：[0, depth)
        int random = new Random().nextInt(depth);
        for (int i = 0; i < random; i++) {
            // 随机取左孩子或右孩子
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis % 2 == 0) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return root;
    }
}
