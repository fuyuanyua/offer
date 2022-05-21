package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question303Test {

    @Test
    void testNumArray2() {
        int[] nums = new int[] {1, 2, 3, 4};
        Question303.NumArray2 numArray2 = new Question303.NumArray2(nums);
        int result = numArray2.sumRange(2, 3);
        log.info("{}", result);
    }

}