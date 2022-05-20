package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/20 15:51
 * @Description: 两数之和 II - 输入有序数组：https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/
 *
 * 笔记：
 *      类型：【双指针（左右指针）】
 */

public class Question167 {

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[2];
        }

        // 左指针
        int left = 0;
        // 右指针
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // 题目要求：数组下标从1开始，而非从0开始
                return new int[] {left + 1, right + 1};
            }
            // 右指针左移：使sum变小
            else if (sum > target) {
                right--;
            }
            // 左指针右移：使sum变大
            else if (sum < target) {
                left++;
            }
        }

        return new int[2];
    }
}
