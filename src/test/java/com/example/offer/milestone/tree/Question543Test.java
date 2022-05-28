package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question543Test {

    @Test
    void diameterOfBinaryTree() {
        TreeNode root = TreeUtil.buildTree();
        // 3
        int result = Question543.diameterOfBinaryTree(root);
        log.info("{}", result);
    }

    @Test
    void diameterOfBinaryTree1() {
        TreeNode root = TreeUtil.buildTree();
        // 3
        int result = Question543.diameterOfBinaryTree1(root);
        log.info("{}", result);
    }
}