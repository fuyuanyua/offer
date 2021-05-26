package com.example.offer.question.tree;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description: 剑指 Offer 27. 二叉树的镜像
 * @Author: lhb
 * @Date: 2021/5/26 12:56
 *
 * 1.说明：请完成一个方法，输入一个二叉树，该方法输出它的镜像。
 * 2.示例：
 *      输入：
 *              4
 *             / \
 *            2   7
 *           / \
 *          1   3
 *
 *      输出：
 *              4
 *             / \
 *            7   2
 *               / \
 *              3   1
 *
 * 3.参考：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 */

public class Question27 {

    /**
     * 定义一个二叉树节点
     */
    @Data
    @Accessors(chain = true)
    public static class TreeNode {

        /**
         * 节点值
         */
        private int value;

        /**
         * 左子树
         */
        private TreeNode left;

        /**
         * 右子树
         */
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    /**
     * 解法1：
     *      思路：先序遍历这棵树，每遍历到一个节点，交换该节点的左右子树
     * @param root
     * @return
     */
    public static TreeNode solution1(TreeNode root) {
        // 或是根节点为null
        // 或是递归终止的条件
        if (root == null) {
            return null;
        }

        // 交换该节点的左右子树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 先序遍历，递归
        solution1(root.left);
        solution1(root.right);

        // 所有节点的左右子树都交换完成，返回根节点
        return root;
    }
}
