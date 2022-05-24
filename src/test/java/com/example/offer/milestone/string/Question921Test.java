package com.example.offer.milestone.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question921Test {

    @Test
    void minAddToMakeValid() {
        String s = "(())))(";
        int result = Question921.minAddToMakeValid(s);
        log.info("{}", result);
    }
}