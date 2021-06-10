package com.example.offer.sort;

import com.example.offer.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: BogoSortTest
 * @Author: lhb
 * @Date: 2021/6/10 23:04
 */

@Slf4j
class BogoSortTest {

    @Test
    void bogoSort() {
        int[] nums = ArrayUtil.createSpecificLengthArray(12);
        log.info("初始数组 = {}", nums);
        long t1 = System.currentTimeMillis();
        long i = BogoSort.bogoSort(nums);
        log.info("排序后的数组 = {}", nums);
        log.info("共执行{}次，共耗时{}ms", i, System.currentTimeMillis() - t1);
    }
}