package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/29 15:22
 * @Description: 最大二叉树：https://leetcode.cn/problems/maximum-binary-tree/
 *
 * 笔记：
 *      类型：【构造二叉树】
 *      二叉树的构造问题一般都用问题分解的思路：构造一棵树 = 根节点 + 构造左子树 + 构造右子树
 * 注意：
 *      通常是通过【数组】来构造二叉树，每次递归调用方法，并不是新建一个子数组来作为方法参数传入
 *      而是在原数组的基础上，确定好起始索引start和终止索引end，传入即可，这样就能确定子数组的有效范围
 */

public class Question654 {

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        return buildTree(nums, start, end);
    }

    /**
     * 根据数组构造一棵树
     * @param nums 数组
     * @param start 数组有效范围：起点索引
     * @param end 数组有效范围：终点索引
     * @return
     */
    private static TreeNode buildTree(int[] nums, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }

        // 找出数组中最大值，构建根节点
        int maxIndex = findMaxIndex(nums, start, end);
        TreeNode root = new TreeNode(nums[maxIndex]);
        // 构造左子树，数组是最大值的左边
        root.left = buildTree(nums, start, maxIndex - 1);
        // 构造右子树，数组是最大值的右边
        root.right = buildTree(nums, maxIndex + 1, end);

        return root;
    }

    /**
     * 找出数组指定范围内的最大值元素的索引
     * @param nums 数组
     * @param start 数组有效范围：起点索引
     * @param end 数组有效范围：终点索引
     * @return
     */
    private static int findMaxIndex(int[] nums, int start, int end) {
        int maxIndex = start;
        int max = nums[start];
        for (int i = start; i <= end; i++) {
            if (nums[i] >= max) {
                maxIndex = i;
                max = nums[i];
            }
        }
        return maxIndex;
    }
}
