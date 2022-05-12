package com.example.offer.question.array.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question57P1Test {

    @Test
    void solution1() {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] result = Question57P1.solution1(nums, target);
        log.info("{}", result);
    }
}