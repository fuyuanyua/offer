package com.example.offer.question.array.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question04Test {

    @Test
    void solution1() {
        int [][] matrix = new int[4][];
        matrix[0] = new int[] {1, 2, 8, 9};
        matrix[1] = new int[] {2, 4, 9, 12};
        matrix[2] = new int[] {4, 7, 10 ,13};
        matrix[3] = new int[] {6, 8, 11, 15};
        boolean result = Question04.solution1(matrix, 7);
        log.info("{}", result);
    }
}