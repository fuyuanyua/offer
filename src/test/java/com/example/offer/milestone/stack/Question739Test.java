package com.example.offer.milestone.stack;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question739Test {

    @Test
    void dailyTemperatures() {
        int[] temperatures = new int[] {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = Question739.dailyTemperatures(temperatures);
        log.info("{}", result);
    }
}