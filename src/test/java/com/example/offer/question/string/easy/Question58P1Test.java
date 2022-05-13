package com.example.offer.question.string.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question58P1Test {

    @Test
    void solution1() {
        String s = "  the sky is blue.  ";
        String result = Question58P1.solution1(s);
        log.info("{}", result);
    }
}