package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/21 15:30
 * @Description: 区域和检索 - 数组不可变：https://leetcode.cn/problems/range-sum-query-immutable/
 *
 * 笔记：
 *      类型：【前缀和】
 *      这种类型的题目，根据输入数组nums构造前缀和数组sum
 *      即sum[i]保存：nums[0] 到 nums[i] 的所有元素的和
 */

public class Question303 {

    /**
     * 普通解法，sumRange方法时间复杂度为O(n)
     */
    public static class NumArray1 {

        private int[] nums;

        /**
         * 初始化 nums 数组
         * @param nums
         */
        public NumArray1(int[] nums) {
            this.nums = nums;
        }

        /**
         * 返回数组 nums 中索引 left 和 right 之间的元素的总和，包含 left 和 right 两点
         * @param left
         * @param right
         * @return
         */
        public int sumRange(int left, int right) {
            int result = 0;
            for (int i = left; i <= right; i++) {
                result += nums[i];
            }
            return result;
        }
    }

    /**
     * 使用前缀和技巧的解法，sumRange方法时间复杂度为O(1)
     */
    public static class NumArray2 {

        /**
         * 前缀和数组
         */
        private int[] sum;

        /**
         * 根据输入的 nums，构造前缀和数组
         * @param nums
         */
        public NumArray2(int[] nums) {
            sum = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    sum[i] = nums[i];
                } else {
                    sum[i] = sum[i - 1] + nums[i];
                }
            }
        }

        /**
         * 直接根据前缀和数组返回结果，时间复杂度 O(1)
         * @param left
         * @param right
         * @return
         */
        public int sumRange(int left, int right) {
            if (left == 0) {
                return sum[right];
            } else {
                return sum[right] - sum[left - 1];
            }
        }
    }
}
