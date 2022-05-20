package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question27Test {

    @Test
    void removeElement() {
        int[] nums = new int[] {1, 2, 3, 3, 3, 4, 5, 8, 9, 9, 10};
        int result = Question27.removeElement(nums, 9);
        log.info("结果为前{}位：{}", result, nums);
    }
}