package com.example.offer.milestone.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question3Test {

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        // 最长无重复子串：abc，所以 = 3
        int result = Question3.lengthOfLongestSubstring(s);
        log.info("{}", result);
    }
}