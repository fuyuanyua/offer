package com.example.offer.milestone.tree.example;

import com.example.offer.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: lihaibin
 * @Date: 2022/5/29 20:42
 * @Description: 二叉搜索树
 *
 * 笔记：
 *      BST：Binary Search Tree，二叉搜索树
 *      具有以下特性：
 *          1.对于BST任意节点node，node的左子树节点都比它小，node的右子树节点都比它大
 *          2.【中序遍历】一棵BST，得到的是【升序】的有序序列
 */

public class BstExample {

    public static List<Integer> traverseBst(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // 中序遍历
        DfsExample.inorder(root, result);
        return result;
    }
}
