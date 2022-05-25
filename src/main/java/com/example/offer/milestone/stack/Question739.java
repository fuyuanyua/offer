package com.example.offer.milestone.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: lihaibin
 * @Date: 2022/5/25 14:54
 * @Description: 每日温度：https://leetcode.cn/problems/daily-temperatures/
 *
 * 笔记：
 *      类型：【单调栈】
 *      单调栈示例题的简单变形
 */

public class Question739 {

    /**
     * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指在第 i 天之后，才会有更高的温度。
     * @param temperatures
     * @return
     */
    public static int[] dailyTemperatures(int[] temperatures) {
        // 用于保存结果
        int[] result = new int[temperatures.length];
        // 单调栈，此题栈里放元素索引，而不是元素本身
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            // 当日温度
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperature) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;

            // 栈里放元素索引，而不是元素本身
            stack.push(i);
        }

        return result;
    }
}
