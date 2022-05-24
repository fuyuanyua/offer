package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/24 15:52
 * @Description: 在排序数组中查找元素的第一个和最后一个位置：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * 笔记：
 *      类型：【二分查找】
 *      左边界的一种含义：
 *          nums = [1, 2, 2, 2, 3, 4], target = 2, 算法返回左边界为1，表示【小于2的元素有1个】
 *          nums = [1, 2, 3, 4], target = 6，算法返回左边界为4，表示【小于6的元素有4个】
 */

public class Question34 {

    /**
     * 找出目标值在数组中的左、右边界
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }

        // 用于保存结果
        int[] result = new int[2];

        // 查找范围[0, nums.length - 1]，左闭右闭
        int left = 0;
        int right = nums.length - 1;

        // 寻找左边界
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            // 若找到了目标值，因为是要寻找左边界，所以继续往左找
            else if (nums[mid] == target) {
                right = mid - 1;
            }
        }
        // 因为while循环退出条件是：left = right + 1
        // 第一种情况：若 target > 数组中所有元素，right 会一直指向 length - 1，left 最终指向 length，所以 left 最终是越界了
        // 第二种情况：target在数组范围内，但不存在数组中，就需要判断
        if (left >= nums.length || nums[left] != target) {
            return new int[] {-1, -1};
        } else {
            result[0] = left;
        }

        // 指针归位
        left = 0;
        right = nums.length - 1;

        // 寻找右边界
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            // 若找到了目标值，因为是寻找右边界，所以继续往右找
            else if (nums[mid] == target) {
                left = mid + 1;
            }
        }
        // 因为while循环退出条件是：left = right + 1
        // 第一种情况：若 target < 数组中所有元素，left 会一直指向 0，right 最终指向 -1，所以 right 最终是越界了
        // 第二种情况：target在数组范围内，但不存在数组中，就需要判断
        if (right < 0 || nums[right] != target) {
            return new int[] {-1, -1};
        } else {
            result[1] = right;
        }

        return result;
    }
}
