package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question283Test {

    @Test
    void moveZeroes() {
        int[] nums = new int[] {0, 0, 1, 3, 5, 0, 2};
        Question283.moveZeroes(nums);
        log.info("{}", nums);
    }
}