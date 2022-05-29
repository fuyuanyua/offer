package com.example.offer.milestone.tree.example;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
class BstExampleTest {

    @Test
    void traverseBst() {
        TreeNode binarySearchTree = TreeUtil.createBinarySearchTree();
        List<Integer> result = BstExample.traverseBst(binarySearchTree);
        log.info("{}", result);
    }
}