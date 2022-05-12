package com.example.offer.question.array.easy;

/**
 * 和为s的两个数字：https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */

public class Question57P1 {

    /**
     * 双指针法
     * @param nums 是排序好的数组
     * @param target
     * @return
     */
    public static int[] solution1(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        // 定义两个指针，left初始指向第一个，right初始指向最后一个
        int left = 0;
        int right = nums.length -1;
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                return new int[] {nums[left], nums[right]};
            }
        }

        return new int[0];
    }
}
