package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question1094Test {

    @Test
    void carPooling() {
        int[][] trips = new int[2][2];
        trips[0] = new int[] {2, 1, 5};
        trips[1] = new int[] {3, 3, 7};
        // 4个座位
        int capacity = 4;

        boolean result = Question1094.carPooling(trips, capacity);
        log.info("{}", result);
    }
}