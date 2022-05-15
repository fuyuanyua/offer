package com.example.offer.question.tree.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question33Test {

    @Test
    void solution1() {
        // 没有右子树
        int[] postorder = new int[] {1, 2};
        boolean result = Question33.solution1(postorder);
        log.info("{}", result);
    }
}