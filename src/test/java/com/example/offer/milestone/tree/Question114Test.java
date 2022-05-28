package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question114Test {

    @Test
    void flatten() {
        TreeNode root = TreeUtil.buildTree();
        // 12453
        Question114.flatten(root);
        log.info("{}", root);
    }
}