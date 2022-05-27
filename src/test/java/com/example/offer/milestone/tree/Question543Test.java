package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question543Test {

    @Test
    void diameterOfBinaryTree() {
        TreeNode root = buildTree();
        // 3
        int result = Question543.diameterOfBinaryTree(root);
        log.info("{}", result);
    }

    private TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        return root;
    }

    @Test
    void diameterOfBinaryTree1() {
        TreeNode root = buildTree();
        // 3
        int result = Question543.diameterOfBinaryTree1(root);
        log.info("{}", result);
    }
}