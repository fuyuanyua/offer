package com.example.offer.question.tree.medium;

import com.example.offer.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: 剑指 Offer 32 - I. 从上到下打印二叉树
 * @Author: lhb
 * @Date: 2021/5/27 13:51
 *
 * 1.说明：从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 2.示例：
 *      输入：
 *              3
 *             / \
 *            9   2
 *               / \
 *              1   7
 *      输出：
 *          [3, 9, 2, 1, 7]
 *
 * 3.参考：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 * 4.笔记：
 *      1.树的遍历方式：
 *          * 深度优先搜索
 *          * 广度优先搜索
 *      2.深度优先搜索：
 *          先序遍历/中序遍历/后续遍历：一般都是使用递归来完成
 *      3.广度优先搜索：
 *          层序遍历：一般借助一个队列来完成
 */

public class Question32P1 {

    /**
     * 解法1：
     *      思路：层序遍历，借助一个队列，利用队列先进先出的特性来完成
     * @param root
     * @return
     */
    public static int[] solution1(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        // 借助此队列来完成对树的层序遍历，初始化保存第一层节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // 动态数组，用于保存遍历结果
        List<Integer> list = new ArrayList<>();

        // 层序遍历
        while (!queue.isEmpty()) {
            // 队列头移除当前节点
            TreeNode currentNode = queue.poll();
            list.add(currentNode.value);

            // 队列尾添加当前节点的左子树
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            // 队列尾添加当前节点的右子树
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
