package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question5Test {

    @Test
    void longestPalindrome() {
        String s = "cbaabd";
        String result = Question5.longestPalindrome(s);
        log.info("{}", result);
    }

    @Test
    void palindrome() {
        String s = "cbaabd";
        String result = Question5.palindrome(s, 0, 0);
        log.info("{}", result);
    }
}