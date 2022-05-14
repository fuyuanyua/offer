package com.example.offer.question.string.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question05Test {

    @Test
    void solution1() {
        String s = "we are young";
        String result = Question05.solution1(s);
        log.info("{}", result);
    }
}