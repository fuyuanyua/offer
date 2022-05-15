package com.example.offer.question.tree.medium;

/**
 * 二叉搜索树的后序遍历序列：https://leetcode.cn/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
 *
 * 二叉搜索树：
 *      左子树节点的值都 < 根节点的值
 *      右子树节点的值都 > 根节点的值
 * 后序遍历：
 *      左 -> 右 -> 根
 */

public class Question33 {

    public static boolean solution1(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return true;
        }

        int start = 0;
        int end = postorder.length - 1;
        return isPostorder(postorder, start, end);
    }

    private static boolean isPostorder(int[] postorder, int start, int end) {
        // 递归终止条件
        if (start >= end) {
            return true;
        }

        // 根节点，一定位于后序遍历序列的最后一个
        int root = postorder[end];

        // pointer指针，从start开启遍历序列，找到第一个大于根节点的元素的index
        int pointer = start;
        while (postorder[pointer] < root) {
            pointer++;
        }
        int index = pointer;
        // 继续往后遍历，[index, end - 1]就是右子树，若出现元素 < root，那么就违反了二叉搜索树的定义
        while (pointer < end) {
            if (postorder[pointer] < root) {
                return false;
            }
            pointer++;
        }

        // [start, index - 1]就是左子树，[index, end - 1]就是右子树，递归判断左、右子树
        return isPostorder(postorder, start, index -1) && isPostorder(postorder, index, end -1);
    }
}
