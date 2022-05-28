package com.example.offer.milestone.tree.example;

import com.example.offer.datastructure.TreeNode;

import java.util.List;

/**
 * @Author: lihaibin
 * @Date: 2022/5/26 20:33
 * @Description: 前序遍历、中序遍历、后序遍历示例（递归实现）
 *
 * 二叉树问题解题思路：
 *      1.是否可以通过遍历一遍二叉树来得到答案？若可以，用一个 traverse 方法配合外部变量来实现
 *      2.是否可以定义一个递归方法，通过子问题（子树）来推导出答案？如果可以，定义出这个递归方法，并充分历用方法的返回值
 *      3.无论哪一种，都要考虑业务逻辑应该写在前、中、后序？
 */

public class DfsExample {

    /**
     * 代码写在不同位置，执行的顺序也不同：
     *      先序位置：在刚进入一个二叉树节点的时候执行
     *      中序位置：在一个二叉树节点的左子树刚遍历完，即将开始遍历右子树之前执行
     *      后续位置：在即将离开一个二叉树节点的时候执行
     * @param root
     */
    public static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        // 先序位置
        // ...

        traverse(root.left);

        // 中序位置
        // ...

        traverse(root.right);

        // 后序位置
        // ...
    }

    /**
     * 在先序位置打印节点，即可得到先序遍历序列
     * @param root
     * @param result 用于保存遍历结果
     */
    public static void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // 先序位置
        result.add(root.value);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    /**
     * 在中序位置打印节点，即可得到中序遍历序列
     * @param root
     * @param result 用于保存遍历结果
     */
    public static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        // 中序位置
        result.add(root.value);
        inorder(root.right, result);
    }

    /**
     * 在后序位置打印节点，即可得到后序遍历序列
     * @param root
     * @param result 用于保存遍历结果
     */
    public static void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postorder(root.left, result);
        postorder(root.right, result);
        // 后序位置
        result.add(root.value);
    }
}
