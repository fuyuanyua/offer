package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question304Test {

    @Test
    void testNumMatrix() {
        int matrix[][] = new int[3][4];
        matrix[0] = new int[] {1, 2, 3, 4};
        matrix[1] = new int[] {1, 2, 3, 4};
        matrix[2] = new int[] {1, 2, 3, 4};

        Question304.NumMatrix numMatrix = new Question304.NumMatrix(matrix);
        int result = numMatrix.sumRegion(0, 0, 1, 1);
        log.info("{}", result);
    }
}