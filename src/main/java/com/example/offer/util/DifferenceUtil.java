package com.example.offer.util;

/**
 * @Author: lihaibin
 * @Date: 2022/5/22 14:44
 * @Description: 差分数组工具类
 */

public class DifferenceUtil {

    /**
     * 差分数组
     */
    private int[] difference;

    /**
     * 根据 nums，构造差分数组 difference
     * @param nums
     */
    public DifferenceUtil(int[] nums) {
        if (nums == null || nums.length == 0) {
            difference = new int[0];
            return;
        }

        difference = new int[nums.length];
        difference[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            difference[i] = nums[i] - nums[i - 1];
        }
    }

    /**
     * 这个方法的作用是：给原数组的闭区间[i, j]都加上value，value可以为负数
     *      首先：difference[i] + value，意味着反推原数组，原数组的[i, length - 1]的每个元素都加了value
     *      然后：difference[j + 1] + value，意味着反推原数组，原数组的[j + 1, length - 1]的每个元素都减了value
     *      综上所述：原数组的[i, j]加了value
     * @param i
     * @param j
     * @param value
     */
    public void increment(int i, int j, int value) {
        if (difference == null || difference.length == 0) {
            return;
        }
        // 先加
        difference[i] += value;
        // 再减，注意要防止越界
        if (j + 1 < difference.length) {
            difference[j + 1] -= value;
        }
    }

    /**
     * 根据差分数组，反推原数组
     *      因为：difference[i] = nums[i] - nums[i - 1]
     *      所以：nums[i] = difference[i] + nums[i - 1]
     * @return
     */
    public int[] getResult() {
        if (difference == null || difference.length == 0) {
            return new int[0];
        }

        // 根据差分数组 difference 反推原数组
        int[] result = new int[difference.length];
        result[0] = difference[0];
        for (int i = 1; i < difference.length; i++) {
            result[i] = difference[i] + result[i - 1];
        }
        return result;
    }
}
