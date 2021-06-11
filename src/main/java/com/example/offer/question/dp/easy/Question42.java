package com.example.offer.question.dp.easy;

import java.util.Arrays;

/**
 * @Description: 剑指 Offer 42. 连续子数组的最大和
 * @Author: lhb
 * @Date: 2021/6/11 12:08
 *
 * 1.说明：输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 2.限制：
 *      要求时间复杂度为O(n)
 *      1 <= arr.length <= 10^5
 *      -100 <= arr[i] <= 100
 * 3.示例：
 *      输入：
 *          [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 *      输出：
 *          6
 *      解释：连续子数组 [4, -1, 2, 1] 的和最大，为6
 * 4.参考：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * 5.笔记：
 *      动态规划：
 *          1.参考：
 *              1.维基百科：https://zh.wikipedia.org/wiki/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92
 *              2.知乎：https://zhuanlan.zhihu.com/p/91582909
 *          2.思想：
 *
 *
 */

public class Question42 {

    /**
     * 解法1：
     *      思路：
     *          动态规划
     *          1.已知数组nums
     *          2.创建一个dp数组，长度为nums.length
     *          3.假设dp[i]是以nums[i]结尾的子数组中的最大和
     *          4.如何求dp[i]?
     *              1.如果dp[i - 1] <= 0，那么dp[i] = nums[i]
     *              2.如果dp[i - 1] > 0，那么dp[i] = nums[i] + dp[i - 1]
     *          5.那么我们从dp数组中找出最大的一个数字，这个数字就是目标结果
     *
     * @param nums
     * @return
     */
    public static int solution1(int[] nums) {
        if (nums.length <= 0) {
            return -1;
        }

        // 创建一个dp数组，长度为nums.length
        int[] dp = new int[nums.length];
        // 给定dp[0]一个初始值
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // 如果dp[i - 1] <= 0，那么dp[i] = nums[i]
            if (dp[i - 1] <= 0) {
                dp[i] = nums[i];
            } else { // 如果dp[i - 1] > 0，那么dp[i] = nums[i] + dp[i - 1]
                dp[i] = nums[i] + dp[i - 1];
            }
        }

        // 从dp数组中找出最大的一个数字，这个数字就是目标结果
        int result = Arrays.stream(dp).max().getAsInt();
        return result;
    }
}
