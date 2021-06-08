package com.example.offer.question.other.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question10P2Test
 * @Author: lhb
 * @Date: 2021/6/8 12:53
 */

@Slf4j
class Question10P2Test {

    @Test
    void solution1() {
        // 输入
        int n = 7;
        log.info("input = {}", n);
        // 输出
        int result = Question10P2.solution1(n);
        log.info("output = {}", result);
    }
}