package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question230Test {

    @Test
    void kthSmallest() {
        TreeNode root = buildTree();
        int result = Question230.kthSmallest(root, 3);
        log.info("{}", result);
    }

    private TreeNode buildTree() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node4;
        return root;
    }
}