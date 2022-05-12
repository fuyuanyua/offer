package com.example.offer.question.stack.medium;

import java.util.Stack;

/**
 * 栈的压入、弹出序列：https://leetcode.cn/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/
 */

public class Question31 {

    public static boolean solution1(int[] pushed, int[] popped) {
        // 辅助栈
        Stack<Integer> stack = new Stack<>();
        // 记录popped下一个要弹出的索引
        int index = 0;

        // 按pushed顺序，把元素压入辅助栈
        for (int i = 0; i < pushed.length; i++) {
            int item = pushed[i];
            stack.push(item);
            // 对比辅助栈栈顶元素与popped当前元素，相等则弹出辅助栈栈顶元素，并把popped索引位后移
            // 循环执行
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }

        // 如果辅助栈所有元素都被弹出，则表示成立
        return stack.isEmpty();
    }
}
