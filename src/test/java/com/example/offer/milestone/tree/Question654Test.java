package com.example.offer.milestone.tree;

import com.example.offer.datastructure.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question654Test {

    @Test
    void constructMaximumBinaryTree() {
        int[] nums = new int[] {3, 2, 1, 6, 0, 5};
        TreeNode result = Question654.constructMaximumBinaryTree(nums);
        log.info("{}", result);
    }
}