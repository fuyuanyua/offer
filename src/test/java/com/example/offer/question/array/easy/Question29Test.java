package com.example.offer.question.array.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class Question29Test {

    @Test
    void solution1() {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[] {1, 2, 3, 4};
        matrix[1] = new int[] {5, 6 ,7 ,8};
        matrix[2] = new int[] {9, 10 ,11 ,12};
        int[] result = Question29.solution1(matrix);
        log.info("{}", result);
    }
}