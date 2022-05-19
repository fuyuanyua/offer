package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question26Test {

    @Test
    void removeDuplicates() {
        int[] nums = new int[] {1, 2, 3, 3, 3, 4, 5, 8, 9, 9, 10};
        int result = Question26.removeDuplicates(nums);
        log.info("{}，{}", result, nums);
    }
}