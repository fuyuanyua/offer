package com.example.offer.question.array.easy;

import com.example.offer.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question53P2Test
 * @Author: lhb
 * @Date: 2021/6/4 13:44
 */

@Slf4j
class Question53P2Test {

    @Test
    void solution1() {
        for (int i = 0; i < 10; i++) {
            log.info("----------第{}次测试----------", i + 1);
            // 随机生成长度为[1, 21)的有序数组，数组的每个数字都唯一且范围都在0～[1, 21)
            int[] nums = ArrayUtil.createQuestion53P2Array();
            // 输入
            log.info("input = {}", nums);
            // 输出
            int result = Question53P2.solution1(nums);
            log.info("output = {}", result);
        }
    }
}