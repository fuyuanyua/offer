package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question370Test {

    @Test
    void getModifiedArray() {
        // 初始化更新操作，要进行两次更新
        int[][] updates = new int[2][3];
        // 第一次更新，原数组的1到3的元素的值都+2
        updates[0] = new int[] {1, 3, 2};
        // 第一次更新，原数组的2到4的元素的值都+3
        updates[1] = new int[] {2, 4, 3};
        int[] result = Question370.getModifiedArray(5, updates);
        log.info("{}", result);
    }
}