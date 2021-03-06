package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;

/**
 * @Description: 剑指 Offer 55 - II. 平衡二叉树
 * @Author: lhb
 * @Date: 2021/5/25 14:51
 *
 * 1.说明：输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 * 2.示例：
 * 3.参考：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
 */

public class Question55P2 {

    /**
     * 解法1：
     *      思路：先序遍历这棵树，判断每个节点，如果树的每一个节点的左右子树的深度差都不超过1，那么这棵树就是平衡二叉树
     *      说明：节点的左右子树的深度都借助Question55P1中的solution1方法得到
     *      缺点：每一个节点的判断都要计算左右子树深度，而左右子树的深度都是递归得到的结果，那么节点会被重复遍历多次
     * @param root
     * @return
     */
    public static boolean solution1(TreeNode root) {
        // 或是根节点为null
        // 或是递归终止的条件
        if (root == null) {
            return true;
        }

        // 当前节点左子树深度
        int leftDepth = Question55P1.solution1(root.getLeft());
        // 当前节点右子树深度
        int rightDepth = Question55P1.solution1(root.getRight());

        // 如果当前节点左右子树深度差查过1，那么这棵树就不是平衡二叉树
        if (leftDepth - rightDepth > 1 || rightDepth - leftDepth > 1) {
            return false;
        }
        // 递归判断当前节点左子树根节点、右子树根节点
        return (solution1(root.getLeft()) && solution1(root.getRight()));
    }
}
