package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/29 17:40
 * @Description: 从前序与中序遍历序列构造二叉树：https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 *
 * 笔记：
 *      类型：【构造二叉树】
 *      设计好递归方法 build
 */

public class Question105 {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0;
        int preEnd = preorder.length - 1;
        int inStart = 0;
        int inEnd = inorder.length - 1;
        return build(preorder, preStart, preEnd, inorder, inStart, inEnd);
    }

    /**
     * 根据 前序序列 和 中序序列 构造二叉树
     * @param preorder 前序序列
     * @param preStart 前序序列有效范围：起始索引
     * @param preEnd 前序序列有效范围：终止索引
     * @param inorder 中序序列
     * @param inStart 中序序列有效范围：起始索引
     * @param inEnd 中序序列有效范围：终止索引
     * @return 二叉树根节点
     */
    private static TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        // base case
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        // 构建根节点
        // 前序序列的第一个元素就是根节点
        int item = preorder[preStart];
        TreeNode root = new TreeNode(item);

        // 构建左子树
        // 在中序序列中找到 item 的索引
        int index = findIndexFromInorder(item, inorder, inStart, inEnd);
        // 那么中序序列中，inStart 到 index - 1 是左子树的中序序列；index + 1 到 inEnd是右子树的中序序列
        // 再求左子树长度：leftLength = (index - 1) - inStart + 1，即：index - inStart
        int leftLength = index - inStart;
        // 那么前序序列中，preStart + 1 到 (preStart + 1) + leftLength - 1 是左子树的前序序列
        // 左子树的前序序列的下一个索引到 inEnd 是右子树的前序序列
        root.left = build(preorder, preStart + 1, preStart + leftLength, inorder, inStart, index - 1);

        // 构建右子树
        root.right = build(preorder, preStart + leftLength + 1, preEnd, inorder, index + 1, inEnd);

        return root;
    }

    /**
     * 返回指定【元素】在【中序序列】的【索引】
     * @param item
     * @param inorder
     * @param inStart
     * @param inEnd
     * @return
     */
    private static int findIndexFromInorder(int item, int[] inorder, int inStart, int inEnd) {
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == item) {
                return i;
            }
        }
        return -1;
    }

}
