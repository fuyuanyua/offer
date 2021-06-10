package com.example.offer.question.array.easy;

import com.example.offer.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question40Test
 * @Author: lhb
 * @Date: 2021/6/10 12:51
 */

@Slf4j
class Question40Test {

    @Test
    void solution1() {
        int[] array = ArrayUtil.createQuestion40Array();
        int k  = 2;
        log.info("input = {}, {}", array, k);
        int[] result = Question40.solution1(array, k);
        log.info("output = {}", result);
    }
}