package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question104Test {

    @Test
    void maxDepth() {
        int result = Question104.maxDepth(TreeUtil.buildTree());
        // 3
        log.info("{}", result);
    }
}