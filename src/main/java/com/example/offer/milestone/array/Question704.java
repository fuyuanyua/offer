package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/23 21:42
 * @Description: 二分查找：https://leetcode.cn/problems/binary-search/
 *
 * 笔记：
 *      类型：【二分查找】
 * 注意：
 *      二分查找的 left 和 right 的初始边界
 *      while循环的终止条件 left <= right
 *      mid计算方法：left + (right - left) / 2，防止溢出
 */

public class Question704 {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // 搜索区间的左边界
        int left = 0;
        // 搜索区间的右边界
        int right = nums.length - 1;

        // 为什么循环终止条件是 left <= right，而不是 left < right？
        // 首先，因为搜索区间[left, right]，左右都是闭区间
        // left <= right 的情况：当 left == right + 1 时，就结束循环，例如[3, 2]，那么这个区间确实没有元素，可以正确退出
        // left < right 的情况：当 left == right 时，就结束循环，例如[2, 2]，但是这个区间有一个元素2，那么这时退出就会导致漏掉了元素2
        while (left <= right) {
            // 等同于 (left + right) / 2
            // 但是采用这种写法：是防止 left 和 right 数值太大，相加直接超过 int 的最大值导致数值溢出变为负数
            int mid  = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
    }
}
