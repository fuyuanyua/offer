package com.example.offer.question.array.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question21Test {

    @Test
    void solution1() {
        int[] array = new int[] {1, 2, 3 ,4 ,5};
        int[] result = Question21.solution1(array);
        log.info("{}", result);
    }
}