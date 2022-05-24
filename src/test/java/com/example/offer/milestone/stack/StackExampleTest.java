package com.example.offer.milestone.stack;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class StackExampleTest {

    @Test
    void example() {
        int[] nums = new int[] {2, 1, 2, 4, 3};
        int[] result = StackExample.example(nums);
        log.info("{}", result);
    }
}