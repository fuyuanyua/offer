package com.example.offer.question.tree.easy;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description: 剑指 Offer 28. 对称的二叉树
 * @Author: lhb
 * @Date: 2021/5/26 13:55
 *
 * 1.说明：
 *      请实现一个方法，用来判断一棵二叉树是不是对称的。
 *      如果一棵二叉树和它的镜像一样（二叉树镜像的定义参考Question27），那么它是对称的。
 * 2.示例：
 *      输入：
 *              8
 *             / \
 *            6   6
 *           / \ / \
 *          5  7 7  5
 *      输出：
 *          true
 *
 * 3.参考：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */

public class Question28 {

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
     *      思路：
     *          判断这棵树的所有对称节点，如果每对对称节点值都相等，那么这棵树就是对称二叉树
     *      判断条件:
     *          1.定义：
     *              假设这棵树根节点的左子树根节点为left，根节点的右子树根节点为right，那么left和right互为对称节点，
     *              同理，left.left和right.right也互为对称节点，left.right和right.left也互为对称节点
     *          2.判断：
     *              left.value == right.value
     *          3.递归判断：
     *              left.left.value == right.right.value && left.right.value == right.left.value
     *          4.递归终止：
     *              1.对称节点值不相等，返回false
     *              2.两个节点，一个是叶子节点的子节点，一个不是，所以这对节点不是对称节点，返回false
     *              3.递归到了两个节点同时都是叶子节点的子节点，返回true
     * @param root
     * @return
     */
    public static boolean solution1(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSatisfied(root.left, root.right);
    }

    /**
     * node1和node2互为对称节点
     * 递归判断所有对称节点是否满足条件
     * @param node1
     * @param node2
     * @return
     */
    private static boolean isSatisfied(TreeNode node1, TreeNode node2) {
        // 两个节点同时是叶子节点的子节点，递归终止，返回true
        if (node1 == null && node2 == null) {
            return true;
        }
        // 两个节点不是对称节点，递归终止，返回false
        if (node1 == null || node2 == null) {
            return false;
        }
        // 对称节点值不相等，递归终止，返回false
        if (node1.value != node2.value) {
            return false;
        }
        // 递归判断node1的左孩子和node2的右孩子、node1的右孩子和node2的左孩子
        return (isSatisfied(node1.left, node2.right) && isSatisfied(node1.right, node2.left));
    }
}
