package com.example.offer.question.array.easy;

import com.example.offer.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question53P1Test
 * @Author: lhb
 * @Date: 2021/6/2 12:15
 */

@Slf4j
class Question53P1Test {

    @Test
    void solution1() {
        log.info("----------测试：目标数字在数组中出现0次----------");
        // 初始化一个正序排序数组
        int[] sortedArray = ArrayUtil.createSortedArray();
        int target1 = 100;
        // 输入
        log.info("input = {}, {}", sortedArray, target1);
        // 输出
        int result1 = Question53P1.solution1(sortedArray, target1);
        log.info("output = {}", result1);

        log.info("----------测试：目标数字在数组中出现2次----------");
        int target2 = 8;
        // 输入
        log.info("input = {}, {}", sortedArray, target2);
        // 输出
        int result2 = Question53P1.solution1(sortedArray, target2);
        log.info("output = {}", result2);
    }
}