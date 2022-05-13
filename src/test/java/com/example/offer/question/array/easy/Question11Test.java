package com.example.offer.question.array.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question11Test {

    @Test
    void solution1() {
        int[] nums = new int[] {3, 4, 5, 1, 2};
        int result = Question11.solution1(nums);
        log.info("{}", result);
    }

    @Test
    void findMin() {
    }
}