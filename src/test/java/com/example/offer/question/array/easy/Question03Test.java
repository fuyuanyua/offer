package com.example.offer.question.array.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question03Test
 * @Author: lhb
 * @Date: 2021/5/31 13:08
 */

@Slf4j
class Question03Test {

    @Test
    void solution1() {
        log.info("----------测试寻找数组中重复的数字----------");
        // 初始化一个数组
        int[] nums = new int[] {2, 3, 1, 0, 2, 5, 3};

        // 输入
        log.info("input = {}", nums);

        //输出
        int result = Question03.solution1(nums);
        log.info("output = {}", result);

    }
}