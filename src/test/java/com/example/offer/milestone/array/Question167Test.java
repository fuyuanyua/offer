package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question167Test {

    @Test
    void twoSum() {
        int[] nums = new int[] {-1, 0};
        int target = -1;
        int[] result = Question167.twoSum(nums, target);
        log.info("{}", result);
    }
}