package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question450Test {

    @Test
    void deleteNode() {
        TreeNode binarySearchTree = TreeUtil.createBinarySearchTree();
        TreeNode result = Question450.deleteNode(binarySearchTree, 2);
        log.info("{}", result);
    }
}