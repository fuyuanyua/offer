package com.example.offer.milestone.string;

import com.example.offer.milestone.string.Question20;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question20Test {

    @Test
    void isValid() {
        String s = "[{()}]";
        boolean result = Question20.isValid(s);
        log.info("{}", result);
    }
}