package com.example.offer.question.string.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question58P2Test {

    @Test
    void solution1() {
        String s = "abcde";
        String s1 = Question58P2.solution1(s, 2);
        log.info("{}", s1);
    }

    @Test
    void reverseString() {
    }
}