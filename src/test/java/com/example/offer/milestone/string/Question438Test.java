package com.example.offer.milestone.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
class Question438Test {

    @Test
    void findAnagrams() {
        String s = "cbaebabacd";
        String p = "abc";

        // 0：cba
        // 6：bac
        List<Integer> result = Question438.findAnagrams(s, p);
        log.info("{}", result);
    }
}