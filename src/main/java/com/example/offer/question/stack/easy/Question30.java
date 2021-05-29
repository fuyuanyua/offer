package com.example.offer.question.stack.easy;

import java.util.Stack;

/**
 * @Description: 剑指 Offer 30. 包含min方法的栈
 * @Author: lhb
 * @Date: 2021/5/28 16:34
 *
 * 1.说明：
 *      定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 方法在该栈中，
 *      调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * 2.示例：
 * 3.参考：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */

public class Question30 {

    /**
     * 自定义栈：除了实现栈的基本功能，额外实现min方法：在O(1)的时间复杂度内得到栈的最小元素
     * 入栈方法和出栈方法同时保证了stack2的栈顶元素始终是栈内最小元素
     */
    public static class MyStack {

        // 数据栈，用于存储数据，实现栈的基本功能
        private Stack<Integer> stack1;

        // 辅助栈，用于额外实现min方法
        private Stack<Integer> stack2;

        public MyStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        /**
         * 入栈：
         *      1.元素a直接压入数据栈stack1
         *      2.辅助栈stack2的栈顶元素需要始终是最小元素：
         *          * 如果stack2中无元素，直接把元素a压入stack2
         *          * 如果stack2中有元素，将stack2的栈顶元素b和元素a比较：
         *              * 如果a < b，直接把元素a压入辅助栈stack2
         *              * 否则，向stack2压入值等于元素b的元素
         * @param x
         */
        public void push(int x) {
            stack1.push(x);
            if (stack2.isEmpty()) {
                stack2.push(x);
            } else {
                Integer peek = stack2.peek();
                if (x < peek) {
                    stack2.push(x);
                } else {
                    stack2.push(peek);
                }
            }
        }

        /**
         * 出栈：
         *      stack1和stack2同步弹出栈顶元素
         */
        public void pop() {
            if (!stack1.isEmpty() && !stack2.isEmpty()) {
                stack1.pop();
                stack2.pop();
            }
        }

        /**
         * 获取栈顶元素：
         *      直接返回stack1的栈顶元素
         * @return
         */
        public int top() {
            if (!stack1.isEmpty()) {
                return stack1.peek();
            }
            return -1;
        }

        /**
         * 获取栈内最小元素：
         *      直接返回stack2的栈顶元素
         * @return
         */
        public int min() {
            if (stack2.isEmpty()) {
                return -1;
            }
            return stack2.peek();
        }
    }
}
