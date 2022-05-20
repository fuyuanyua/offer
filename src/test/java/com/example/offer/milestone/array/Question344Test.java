package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question344Test {

    @Test
    void reverseString() {
        String str = "abcdefg";
        char[] s = str.toCharArray();
        Question344.reverseString(s);
        log.info("{}", s);
    }
}