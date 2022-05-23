package com.example.offer.milestone.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question567Test {

    @Test
    void checkInclusion() {
        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean result = Question567.checkInclusion(s1, s2);
        log.info("{}", result);
    }
}