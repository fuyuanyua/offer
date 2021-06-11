package com.example.offer.question.dp.easy;

import com.example.offer.question.array.easy.Question40;
import com.example.offer.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question42Test
 * @Author: lhb
 * @Date: 2021/6/11 23:56
 */

@Slf4j
class Question42Test {

    @Test
    void solution1() {
        int[] nums = ArrayUtil.createQuestion42Array();
        log.info("input = {}", nums);
        int result = Question42.solution1(nums);
        log.info("output = {}", result);
    }
}