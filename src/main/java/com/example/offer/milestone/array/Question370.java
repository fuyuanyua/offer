package com.example.offer.milestone.array;

import com.example.offer.util.DifferenceUtil;

/**
 * @Author: lihaibin
 * @Date: 2022/5/22 14:32
 * @Description: 区间加法：https://leetcode.cn/problems/range-addition/
 *
 * 输入：原数组nums，进行k次更新操作：update[k][3]，单次更新操作例如[0, 1, 2]，表示对原数组的第0个到第1个元素的值都加2
 * 输出：经过k次更新操作后的数组
 *
 * 笔记：
 *      类型：【差分数组】
 *      相比较于【前缀和】，【差分数组】类型的题目都要求在原数组上进行修改，然后问最终的结果
 */

public class Question370 {

    public static int[] getModifiedArray(int length, int[][] updates) {
        if (length <= 0) {
            return new int[0];
        }

        // 初始化原数组，元素都为0
        int[] nums = new int[length];
        // 构造差分数组
        DifferenceUtil differenceUtil = new DifferenceUtil(nums);
        for (int[] update : updates) {
            int start = update[0];
            int end = update[1];
            int value = update[2];
            differenceUtil.increment(start, end, value);
        }

        return differenceUtil.getResult();
    }
}
