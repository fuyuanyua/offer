package com.example.offer.milestone.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: lihaibin
 * @Date: 2022/5/24 21:59
 * @Description: 单调栈示例
 */

public class StackExample {

    /**
     * 输入一个数组，返回一个等长数组，数组的对应索引存储下一个更大元素，若没有下一个更大元素，填入-1
     * 例如：
     *      输入：[2, 1, 2, 4, 3]
     *      输出：[4, 2, 4, -1, -1]
     * @return
     */
    public static int[] example(int[] nums) {
        // 用于保存结果
        int[] result = new int[nums.length];
        // 单调栈
        Deque<Integer> stack = new ArrayDeque<>();

        // 从后往前遍历
        for (int i = nums.length - 1; i >= 0; i--) {
            // 1.首先构建当前索引位的结果
            int num = nums[i];
            // 把栈中 <= 当前元素的都弹出
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            // 结束循环
            // 或是当前栈顶元素 > num（那么就找到下一个更大元素），或是栈已经没有元素了（那么就没有下一个更大元素，填入-1）
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            // 2.然后把当前元素放入单调栈
            stack.push(num);
        }

        return result;
    }
}
