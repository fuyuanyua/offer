package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question538Test {

    @Test
    void convertBST() {
        TreeNode root = TreeUtil.buildTree();
        TreeNode result = Question538.convertBST(root);
        log.info("{}", result);
    }
}