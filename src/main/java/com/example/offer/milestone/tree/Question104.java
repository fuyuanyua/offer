package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/26 22:49
 * @Description: 二叉树的最大深度：https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 */

public class Question104 {

    /**
     * 记录当前遍历到的节点的深度
     */
    public static int depth = 0;

    /**
     * 记录最大深度
     */
    public static int maxDepth = 0;

    /**
     * 二叉树的深度：根节点到最远的叶子节点的路径上的节点数
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        traverse(root);
        return maxDepth;
    }

    /**
     * 遍历这棵树，每遍历到一个节点，记录当前节点深度，若当前节点是叶子节点，则更新最大深度
     * @param root
     */
    private static void traverse(TreeNode root) {
        if (root == null ) {
            return;
        }

        // 前序位置
        depth++;
        // 若当前节点是叶子节点，则要更新最大深度
        if (root.left == null && root.right == null) {
            maxDepth = Math.max(maxDepth, depth);
        }

        traverse(root.left);
        traverse(root.right);

        // 后续位置
        depth--;
    }
}
