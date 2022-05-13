package com.example.offer.question.array.easy;

/**
 * 旋转数组的最小数字：https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */

public class Question11 {

    public static int solution1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        // 34512，345为第一个递增区间，12为第二个递增区间
        // 第二个递增区间的元素的值一定 <= 第一个递增区间的元素的值
        while (left < right) {
            int mid = left + (right - left) / 2;
            // 若mid元素 > right元素，则mid元素处于第一个递增区间，那么最小元素一定在mid元素右边
            // 为什么mid元素不跟left元素比较？
            // 防止12345这种情况，即移动0个元素，若mid跟left比较，就会判断错误
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // 若mid元素 < right元素，则mid元素处于第二个递增区间，那么最小元素一定在mid元素左边/或者mid元素本身
            else if (nums[mid] < nums[right]) {
                right = mid;
            }
            // mid元素等于right元素的情况，无法判断
            // 10111和11101的情况，无法判断mid落在哪个递增区间
            // 退化为O(n)的线性查找
            else {
                return findMin(nums);
            }
        }

        return nums[left];
    }

    /**
     * 线性查找，找出数组最小元素
     * @param nums
     * @return
     */
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
