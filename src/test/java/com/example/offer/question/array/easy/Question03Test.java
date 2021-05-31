package com.example.offer.question.array.easy;

import com.example.offer.util.ArrayUtil;
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
        log.info("----------测试包含重复数字的数组----------");
        // 初始化一个包含重复数字的数组
        int[] nums1 = ArrayUtil.createRepeatedArray();
        // 输入
        log.info("input = {}", nums1);
        //输出
        int result1 = Question03.solution1(nums1);
        log.info("output = {}", result1);

        log.info("----------测试没有重复数字的数组----------");
        // 初始化一个包含重复数字的数组
        int[] nums2 = ArrayUtil.createNoRepeatedArray();
        // 输入
        log.info("input = {}", nums2);
        //输出
        int result2 = Question03.solution1(nums2);
        log.info("output = {}", result2);
    }

    @Test
    void solution2() {
        log.info("----------测试包含重复数字的数组----------");
        // 初始化一个包含重复数字的数组
        int[] nums1 = ArrayUtil.createRepeatedArray();
        // 输入
        log.info("input = {}", nums1);
        //输出
        int result1 = Question03.solution2(nums1);
        log.info("output = {}", result1);

        log.info("----------测试没有重复数字的数组----------");
        // 初始化一个包含重复数字的数组
        int[] nums2 = ArrayUtil.createNoRepeatedArray();
        // 输入
        log.info("input = {}", nums2);
        //输出
        int result2 = Question03.solution2(nums2);
        log.info("output = {}", result2);
    }

    @Test
    void solution3() {
        log.info("----------测试包含重复数字的数组----------");
        // 初始化一个包含重复数字的数组
        int[] nums1 = ArrayUtil.createRepeatedArray();
        // 输入
        log.info("input = {}", nums1);
        //输出
        int result1 = Question03.solution3(nums1);
        log.info("output = {}", result1);

        log.info("----------测试没有重复数字的数组----------");
        // 初始化一个包含重复数字的数组
        int[] nums2 = ArrayUtil.createNoRepeatedArray();
        // 输入
        log.info("input = {}", nums2);
        //输出
        int result2 = Question03.solution3(nums2);
        log.info("output = {}", result2);
    }
}