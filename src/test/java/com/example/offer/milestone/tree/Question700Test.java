package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question700Test {

    @Test
    void searchBST() {
        TreeNode root = TreeUtil.createBinarySearchTree();
        TreeNode result = Question700.searchBST(root, 4);
        log.info("{}", result);
    }
}