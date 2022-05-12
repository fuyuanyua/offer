package com.example.offer.question.array.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question57P2Test {

    @Test
    void solution1() {
        int[][] result = Question57P2.solution1(15);
        int length = result.length;
        for (int i = 0; i < length; i++) {
            log.info("{}", result[i]);
        }
    }
}