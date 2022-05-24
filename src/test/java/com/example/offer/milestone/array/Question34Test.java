package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question34Test {

    @Test
    void searchRange() {
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = Question34.searchRange(nums, target);
        log.info("{}", result);
    }
}