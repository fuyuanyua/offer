package com.example.offer.question.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为s的连续正数序列：https://leetcode.cn/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 */

public class Question57P2 {

    /**
     * 滑动窗口
     * @param target
     * @return
     */
    public static int[][] solution1(int target) {
        // 定义连续正整数序列的左边界left和右边界right
        int left = 1;
        int right = 2;
        // 连续正整数序列和，初始为3
        int s = 3;
        List<int[]> list = new ArrayList<>();
        while (left < right) {
            if (s < target) {
                right++;
                s += right;
            } else if (s > target) {
                s -= left;
                left++;
            } else {
                int[] array = new int[right - left + 1];
                int item = left;
                for (int i = 0; i < array.length; i++) {
                    array[i] = item;
                    item++;
                }
                list.add(array);
                right++;
                s += right;
            }
        }

        return list.toArray(new int[list.size()][]);
    }

}
