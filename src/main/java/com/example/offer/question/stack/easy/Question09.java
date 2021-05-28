package com.example.offer.question.stack.easy;

import java.util.Stack;

/**
 * @Description: 剑指 Offer 09. 用两个栈实现队列
 * @Author: lhb
 * @Date: 2021/5/28 13:51
 *
 * 1.说明：
 *      用两个栈实现一个队列。队列的声明如下，
 *      请实现它的两个方法 appendTail 和 deleteHead，
 *      分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 2.示例：
 *      执行步骤：
 *          1.创建自定义队列
 *          2.插入元素2
 *          3.插入元素1
 *          4.删除元素
 *          5.删除元素
 *          6.删除元素
 *      执行结果：
 *          1.null
 *          2.null
 *          3.null
 *          4.2
 *          5.1
 *          6.-1
 *
 * 3.参考：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * 4.笔记：
 *      1.栈：先进后出
 *      2.队列：先进先出
 */

public class Question09 {

    /**
     * 自定义队列类：使用两个栈实现一个队列
     */
    public static class MyQueue {

        private Stack<Integer> stack1;

        private Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        /**
         * 添加元素到队列尾
         * @param value
         */
        public void appendTail(Integer value) {
            // 添加元素，都直接压入stack1
            stack1.push(value);
        }

        /**
         * 删除队列头元素
         * @return
         */
        public Integer deleteHead() {
            // 如果stack2中没有元素，则依次弹出stack1的元素压入stack2，直至stack1中没有元素
            // 然后弹出stack2的栈顶元素
            if (stack2.isEmpty()) {
                // 如果stack1也没有元素，说明这个自定义队列里没有元素，依照题目要求返回-1
                if (stack1.isEmpty()) {
                    return -1;
                }
                while (!stack1.isEmpty()) {
                    Integer pop = stack1.pop();
                    stack2.push(pop);
                }
                Integer pop = stack2.pop();
                return pop;
            } else { // 否则直接弹出stack2的栈顶元素
                Integer pop = stack2.pop();
                return pop;
            }
        }
    }
}
