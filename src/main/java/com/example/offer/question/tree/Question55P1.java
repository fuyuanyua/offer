package com.example.offer.question.tree;

import com.example.offer.question.linkedlist.Question24;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 剑指 Offer 55 - I. 二叉树的深度
 * @Author: lhb
 * @Date: 2021/5/21 15:56
 *
 * 1.说明：输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * 2.示例：
 * 3.参考：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 * 4.笔记：
 *      1.树的遍历一般分为两种：
 *          * DFS：Depth First Search，深度优先搜索
 *          * BFS：Breadth First Search，广度优先搜索
 *      2.常见的DFS：先序遍历、中序遍历、后序遍历
 *      3.常见的BFS：层序遍历
 */

public class Question55P1 {

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
     *      思路：递归
     * @param root
     * @return
     */
    public static int solution1(TreeNode root) {
        // 情况1：树的根节点为null，直接返回0
        // 情况2：如果当前节点是叶子节点的子节点，跳出递归
        if (root == null) {
            return 0;
        }
        // 当前节点的左子树深度
        int leftDepth = solution1(root.left);
        // 当前节点的右子树深度
        int rightDepth = solution1(root.right);
        // 返回当前节点左右子树中较大的深度，再加上自身，就是这棵树的最大深度
        return (leftDepth >= rightDepth ? leftDepth : rightDepth) + 1;
    }

    /**
     * 解法2：
     *      思路：层序遍历
     * @param root
     * @return
     */
    public static int solution2(TreeNode root) {
        // 树的根节点为null，直接返回0
        if (root == null) {
            return 0;
        }

        // 记录树的深度
        int depth = 0;
        // 存储当前层的节点，初始化存储根节点
        Queue<TreeNode> currentLayer = new LinkedList<>();
        currentLayer.add(root);

        while (!currentLayer.isEmpty()) {
            // 临时存储下一层的节点
            Queue<TreeNode> nextLayer = new LinkedList<>();
            for (TreeNode node : currentLayer) {
                if (node.left != null) {
                    nextLayer.add(node.left);
                }
                if (node.right != null) {
                    nextLayer.add(node.right);
                }
            }
            currentLayer = nextLayer;
            depth++;
        }

        return depth;
    }
}
