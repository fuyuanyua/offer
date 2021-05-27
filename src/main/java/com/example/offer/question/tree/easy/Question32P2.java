package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * @Author: lhb
 * @Date: 2021/5/27 10:19
 *
 * 1.说明：从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 * 2.示例：
 *      输入：
 *              3
 *             / \
 *            9   2
 *               / \
 *              1   7
 *      输出：
 *          [[3], [9, 2], [1, 7]]
 *
 * 3.参考：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 */

public class Question32P2 {

    /**
     * 解法1：
     *      思路：在Question32P1的基础上，将每一层的遍历结果都保存起来
     * @param root
     * @return
     */
    public static List<List<Integer>> solution1(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // 借助队列完成层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // 每走一次循环，遍历一层
        while (!queue.isEmpty()) {
            // 用于保存该层的节点
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                list.add(currentNode.value);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(list);
        }

        return result;
    }
}
