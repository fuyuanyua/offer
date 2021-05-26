package com.example.offer.question.tree.easy;

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
     * 笔记：
     *      Java的Queue接口相关API：
     *          * offer方法：
     *              boolean offer(E e); 向队列尾插入一个元素
     *          * poll方法：
     *              E poll(); 将队列头元素移除，并返回这个元素
     *
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
        currentLayer.offer(root);

        while (!currentLayer.isEmpty()) {
            // 临时存储下一层的节点
            Queue<TreeNode> nextLayer = new LinkedList<>();
            for (TreeNode node : currentLayer) {
                if (node.left != null) {
                    nextLayer.offer(node.left);
                }
                if (node.right != null) {
                    nextLayer.offer(node.right);
                }
            }
            currentLayer = nextLayer;
            depth++;
        }

        return depth;
    }

    /**
     * 解法3：
     *      思路：层序遍历
     *      优化：解法2基础上进行优化，无需new额外的队列
     * @param root
     * @return
     */
    public static int solution3(TreeNode root) {
        // 树的根节点为null，直接返回0
        if (root == null) {
            return 0;
        }

        // 记录树的深度
        int depth = 0;
        // 存储当前层的节点，初始化存储根节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                // 队列头移除
                TreeNode node = queue.poll();
                if (node.left != null) {
                    // 队列尾添加
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    // 队列尾添加
                    queue.offer(node.right);
                }
            }
            // 保证了以上循环走完，queue中存储的都是下一层的节点
            depth++;
        }

        return depth;
    }
}
