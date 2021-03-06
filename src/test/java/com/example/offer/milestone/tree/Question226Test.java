package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question226Test {

    @Test
    void invertTree() {
        TreeNode result = Question226.invertTree(TreeUtil.buildTree());
        log.info("{}", result);
    }
}