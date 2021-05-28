package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 剑指 Offer 54. 二叉搜索树的第k大节点
 * @Author: lhb
 * @Date: 2021/5/28 09:55
 *
 * 1.说明：给定一棵二叉搜索树，请找出其中第k大的节点。
 * 2.示例：
 *      输入：
 *          root = 5
 *                / \
 *               3   7
 *              / \ / \
 *             2  4 6  8,
 *          k = 3
 *      输出：
 *          6
 *
 * 3.参考：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 * 4.笔记：
 *      1.二叉搜索树（Binary Search Tree）：
 *          对于一棵二叉搜索树，它或为一棵空树，或满足以下条件：对于二叉搜索树的任意节点，
 *          它的左子树所有节点的值都小于根节点的值，它的右子树的所有节点都大于根节点的值
 *          https://zh.wikipedia.org/wiki/%E4%BA%8C%E5%85%83%E6%90%9C%E5%B0%8B%E6%A8%B9
 *      2.特性：
 *          根据二叉搜索树的特性，中序遍历一棵二叉搜索树，必定得到一个递增排序的有序序列
 */

public class Question54 {

    /**
     * 解法1：
     *      思路：中序遍历这棵树得到递增的有序序列，第k大则是数组下标为list.size() - k的元素的值
     * @param root
     * @param k
     * @return
     */
    public static int solution1(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        if (root == null || k <= 0) {
            return 0;
        }

        dfs(root, list);

        int size = list.size();
        int result = list.get(size - k);
        return result;
    }

    /**
     * 中序遍历，并把值存入动态数组
     * @param root
     * @param list
     */
    private static void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        // 左
        if (root.left != null) {
            dfs(root.left, list);
        }
        // 根
        list.add(root.value);
        // 右
        if (root.right != null) {
            dfs(root.right, list);
        }
    }

}
