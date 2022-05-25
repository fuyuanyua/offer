package com.example.offer.milestone.stack;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question503Test {

    @Test
    void nextGreaterElements() {
        int[] nums = new int[] {1, 2, 1};
        int[] result = Question503.nextGreaterElements(nums);
        log.info("{}", result);
    }
}