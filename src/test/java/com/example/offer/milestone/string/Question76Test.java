package com.example.offer.milestone.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question76Test {

    @Test
    void minWindow() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = Question76.minWindow(s, t);
        log.info("{}", result);
    }
}