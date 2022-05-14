package com.example.offer.question.tree.medium;

import com.example.offer.datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 重建二叉树：https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/
 */

public class Question07 {

    public static TreeNode solution1(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }

        // 用于缓存中序遍历序列：value -> index的映射
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // 先序遍历：根、左、右
        // 中序遍历：左、根、右
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1, map);
    }

    /**
     * 构建一棵树
     * @param preorder 原始先序遍历序列
     * @param inorder 原始中序遍历序列
     * @param preStart 要构造这棵树所用到的先序遍历start索引
     * @param preEnd 要构造这棵树所用到的先序遍历end索引
     * @param inStart 要构造这棵树所用到的中序遍历start索引
     * @param inEnd 要构造这棵树所用到的中序遍历end索引
     * @param map 缓存，用于O(1)时间复杂度获取到value在中序遍历序列中的index
     */
    public static TreeNode build(int[] preorder, int[] inorder,
                             int preStart, int preEnd, int inStart, int inEnd,
                             Map<Integer, Integer> map) {
        // 递归中止条件
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        // 根节点，是先序遍历的第一个节点
        int nodeValue = preorder[preStart];
        TreeNode node = new TreeNode(nodeValue);
        // 根据根节点的值 -> 根节点在中序遍历的索引
        Integer index = map.get(nodeValue);
        //求左子树序列的长度
//        int leftLength = ((index - 1) - inStart) + 1;
        int leftLength = index - inStart;

        // 左子树序列：preEnd计算方法：新preStart + leftLength - 1
        node.left = build(preorder, inorder, preStart + 1, preStart + leftLength, inStart, index - 1, map);
        // 右子树序列：preStart计算方法：左子树preEnd的下一个
        node.right = build(preorder, inorder, preStart + leftLength + 1, preEnd, index + 1, inEnd, map);
        return node;
    }
 }
