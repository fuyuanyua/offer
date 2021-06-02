package com.example.offer.question.array.easy;

import org.springframework.util.CollectionUtils;

import java.util.Collections;

/**
 * @Description: 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * @Author: lhb
 * @Date: 2021/6/1 11:27
 *
 * 1.说明：统计一个数字在排序数组中出现的次数。
 * 2.示例：
 *      输入：
 *          [5, 7, 7, 8, 8, 10], 8
 *      输出：
 *          2
 * 3.参考：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 * 4.笔记：
 *      排序数组查找：优先考虑二分法（二分法查找时间复杂度O(logn)）
 */

public class Question53P1 {

    /**
     * 解法1：
     *      思路：
     *          二分法查找，查找出第一个目标数字的下标first和最后一个目标数字的下标last，
     *          则此数字在数组中出现的次数为(last - first + 1)次
     * @param nums
     * @param target
     * @return
     */
    public static int solution1(int[] nums, int target) {
        int length = nums.length;
        if (length <= 0) {
            return 0;
        }

        int left = 0;
        int right = length - 1;
        int mid;

        int first = -1;
        int last = -1;

        // 先找第一个目标数字的下标
        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (mid - 1 >= 0) {
                    if (nums[mid - 1] != target) {
                        first = mid;
                        break;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    first = mid;
                    break;
                }
            }
        }

        if (first == -1) {
            return 0;
        }

        left = 0;
        right = length - 1;
        // 再找最后一个目标数字的下标
        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (mid + 1 <= length - 1) {
                    if (nums[mid + 1] != target) {
                        last = mid;
                        break;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    last = mid;
                    break;
                }
            }
        }

        return last - first + 1;
    }
}
