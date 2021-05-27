package com.example.offer.question.tree.medium;

import com.example.offer.datastructure.TreeNode;

import java.util.*;

/**
 * @Description: 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * @Author: lhb
 * @Date: 2021/5/27 16:51
 *
 * 1.说明：
 *      请实现一个方法，从上到下按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 *      第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * 2.示例：
 *      输入：
 *              3
 *             / \
 *            9   2
 *               / \
 *              1   7
 *      输出：
 *          [[3], [2, 9], [1, 7]]
 *
 * 3.参考：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 */

public class Question32P3 {

    /**
     * 解法1：
     *      思路：
     *          可以找到规律：奇数层正序打印，偶数层倒序打印，
     *          所以仍然是层序遍历，在Question32P1的基础上，
     *          如果是奇数层，直接按遍历顺序保存结果，
     *          如果是偶数层，借助一个栈，按遍历顺序把结果存入栈，当这一层遍历完后，先进后出弹出并保存结果
     *      缺点：偶数层被遍历两次
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
        // 奇数层标志
        boolean flag = true;

        while (!queue.isEmpty()) {
            // 用于保存该层的节点
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            // 如果是奇数层
            if (flag) {
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
                flag = false;
            } else { // 如果是偶数层
                Stack<TreeNode> stack = new Stack<>();
                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = queue.poll();
                    stack.push(currentNode);
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                for (int i = 0; i < size; i++) {
                    TreeNode pop = stack.pop();
                    list.add(pop.value);
                }
                result.add(list);
                flag = true;
            }
        }

        return result;
    }

    /**
     * 解法2：
     *      思路：
     *          利用两个栈来层序遍历这棵树，
     *          栈1用于遍历奇数层，栈2用于遍历偶数层
     *      优化：对比解法1，此解法全部节点都只遍历一次
     * @param root
     * @return
     */
    public static List<List<Integer>> solution2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // 用于遍历奇数层
        Stack<TreeNode> stack1 = new Stack<>();
        stack1.push(root);
        // 用于遍历偶数层
        Stack<TreeNode> stack2 = new Stack<>();
        // 奇数层标志
        boolean flag = true;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            // 用于保存该层的节点
            List<Integer> list = new ArrayList<>();
            // 如果当前是奇数层
            if (flag) {
                int size = stack1.size();
                for (int i = 0; i < size; i++) {
                    TreeNode current = stack1.pop();
                    list.add(current.value);
                    // 将下一层节点（偶数层）正序push进stack2
                    // 那么遍历下一层（stack2）的时候，pop出的就是倒序的
                    if (current.left != null) {
                        stack2.push(current.left);
                    }
                    if (current.right != null) {
                        stack2.push(current.right);
                    }
                }
                result.add(list);
                flag = false;
            } else { // 如果当前是偶数层
                int size = stack2.size();
                for (int i = 0; i < size; i++) {
                    TreeNode current = stack2.pop();
                    list.add(current.value);
                    // 将下一层节点（奇数层）倒序push进stack1
                    // 那么遍历下一层（stack1）的时候，pop出的就是正序的
                    if (current.right != null) {
                        stack1.push(current.right);
                    }
                    if (current.left != null) {
                        stack1.push(current.left);
                    }
                }
                result.add(list);
                flag = true;
            }
        }

        return result;
    }
}
