package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/27 20:11
 * @Description: 二叉树的直径：https://leetcode.cn/problems/diameter-of-binary-tree/
 *
 * 笔记：
 *      类型：【递归-后序位置】
 */

public class Question543 {

    /**
     * 最长直径
     */
    private static int maxDiameter = 0;

    /**
     * 解法1：
     *      一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
     *      求这棵二叉树的直径，实际上就是遍历这棵二叉树，
     *      算出每个节点的直径（ = 该节点的左子树最大深度 + 该节点的右子树最大深度），最后取所有直径中的最大值
     * @param root
     * @return
     */
    public static int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return maxDiameter;
    }

    /**
     * 遍历一棵树
     *      这个方法把计算直径的逻辑放在【前序位置】，时间复杂度很差：O(n^2)，因为每遍历到一个节点，还要递归调用 maxDepth 方法
     *      那么能不能优化呢？可以参考 maxDepth1 方法，这是对 maxDepth 方法的改进，直接把计算直径的逻辑放在【后序位置】
     * @param root
     */
    private static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        // 前序位置
        // 当前节点左子树最大深度
        int leftMaxDepth = maxDepth(root.left);
        // 当前节点右子树最大深度
        int rightMaxDepth = maxDepth(root.right);
        // 当前节点直径
        int diameter = leftMaxDepth + rightMaxDepth;
        maxDiameter = Math.max(diameter, maxDiameter);

        traverse(root.left);
        traverse(root.right);
    }

    /**
     * 计算一棵树的最大深度
     * @param root
     * @return
     */
    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);

        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }

    /**
     * 解法2：
     *      maxDepth1 方法里，直接把计算直径的逻辑放在【后序位置】
     *      那么时间复杂度就是：O(n)
     * @param root
     * @return
     */
    public static int diameterOfBinaryTree1(TreeNode root) {
        maxDepth1(root);
        return maxDiameter;
    }

    private static int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);

        // 后序位置，顺便求 maxDiameter
        maxDiameter = Math.max(maxDiameter, leftMaxDepth + rightMaxDepth);

        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
