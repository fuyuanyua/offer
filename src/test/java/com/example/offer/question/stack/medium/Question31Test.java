package com.example.offer.question.stack.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class Question31Test {

    @Test
    void solution1() {
        int[] pushed = new int[] {1, 2, 3, 4 ,5};
        int[] popped = new int[] {4, 5 ,3, 2, 1};
        boolean result = Question31.solution1(pushed, popped);
        // push 1
        // push 2
        // push 3
        // push 4
        // pop 4
        // push 5
        // pop 5
        // pop 3
        // pop 2
        // pop 1
        log.info("{}", result);
    }
}