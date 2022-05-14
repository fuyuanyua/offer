package com.example.offer.question.tree.medium;

import com.example.offer.datastructure.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question07Test {

    @Test
    void solution1() {
        int[] preorder = new int[] {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = new int[] {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = Question07.solution1(preorder, inorder);
        log.info("{}", root);
    }
}