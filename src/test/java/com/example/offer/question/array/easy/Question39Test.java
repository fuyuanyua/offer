package com.example.offer.question.array.easy;

import com.example.offer.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question39Test
 * @Author: lhb
 * @Date: 2021/6/8 14:37
 */

@Slf4j
class Question39Test {

    @Test
    void solution1() {
        int[] nums = ArrayUtil.createQuestion39Array();
        log.info("input = {}", nums);
        int result = Question39.solution1(nums);
        log.info("output = {}", result);
    }

    @Test
    void solution2() {
        int[] nums = ArrayUtil.createQuestion39Array();
        log.info("input = {}", nums);
        int result = Question39.solution2(nums);
        log.info("output = {}", result);
    }
}