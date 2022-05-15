package com.example.offer.question.backtracking.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
class LeetCode46Test {

    @Test
    void solution1() {
        int[] nums = new int[] {1, 2, 3};
        List<List<Integer>> result = LeetCode46.solution1(nums);
        log.info("{}", result);
    }
}