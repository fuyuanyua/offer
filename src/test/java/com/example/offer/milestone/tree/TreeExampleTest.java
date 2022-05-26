package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class TreeExampleTest {

    @Test
    void preorder() {
        List<Integer> result = new ArrayList<>();
        // 12453
        TreeExample.preorder(buildTree(), result);
        log.info("{}", result);
    }

    @Test
    void inorder() {
        List<Integer> result = new ArrayList<>();
        // 42513
        TreeExample.inorder(buildTree(), result);
        log.info("{}", result);
    }

    @Test
    void postorder() {
        List<Integer> result = new ArrayList<>();
        // 45231
        TreeExample.postorder(buildTree(), result);
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
}