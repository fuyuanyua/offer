package com.example.offer.milestone.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 14:55
 * @Description: 下一个更大元素 II：https://leetcode.cn/problems/next-greater-element-ii/
 *
 * 笔记：
 *      类型：【单调栈】
 *      数组改为环形数组：给定一个循环数组 nums （ nums[nums.length - 1] 的下一个元素是 nums[0]
 */
public class Question503 {

    /**
     * 返回 nums 中每个元素的 下一个更大元素
     * @param nums 环形数组
     * @return
     */
    public static int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        // 用于保存临时结果
        int[] tempResult = new int[length * 2];

        // 创建一个临时数组，用于表示环形数组，例如：[1, 2, 3] -> [1, 2, 3, 1, 2, 3]
        int[] temp = new int[length * 2];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i % length];
        }

        // 单调栈
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = temp.length - 1; i >= 0; i--) {
            int num = temp[i];
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            tempResult[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(num);
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = tempResult[i];
        }

        return result;
    }
}
