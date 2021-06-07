package com.example.offer.question.other.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question10P1Test
 * @Author: lhb
 * @Date: 2021/6/7 17:49
 */

@Slf4j
class Question10P1Test {

    @Test
    void solution1() {
        // 输入
        int n = 40;
        log.info("input = {}", n);
        // 输出
        // 如果n稍微大一点，耗时就会非常久
        int result = Question10P1.solution1(n);
        log.info("output = {}", result);

    }

    @Test
    void solution2() {
        // 输入
        int n = 1000;
        log.info("input = {}", n);
        // 输出
        int result = Question10P1.solution2(n);
        log.info("output = {}", result);
    }
}