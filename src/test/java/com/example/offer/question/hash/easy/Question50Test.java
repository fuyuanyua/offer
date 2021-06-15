package com.example.offer.question.hash.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question50Test
 * @Author: lhb
 * @Date: 2021/6/15 下午2:03
 */

@Slf4j
class Question50Test {

    @Test
    void solution1() {
        String s = "abaccdeff";
        log.info("input = {}", s);
        char result = Question50.solution1(s);
        log.info("output = {}", result);
    }
}