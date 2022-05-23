package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question704Test {

    @Test
    void search() {
        int[] nums = new int[] {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = Question704.search(nums, 9);
        log.info("{}", result);
    }
}