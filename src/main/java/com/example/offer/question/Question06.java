package com.example.offer.question;

import lombok.Data;

import java.util.Stack;

/**
 * @Description: 剑指 Offer 06. 从尾到头打印链表
 *      1.说明：输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 *      2.参考：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * @Author: lhb
 * @Date: 2021/5/17 22:45
 */

public class Question06 {

    /**
     * 定义一个单向链表节点
     */
    @Data
    public static class ListNode {

        /**
         * 节点值
         */
        private int value;

        /**
         * 后继节点
         */
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    /**
     * 思路：利用栈先进后出的特性
     * @param head
     * @return
     */
    public static int[] solution(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;

        // 1.先遍历链表，将值存入栈
        while (null != node) {
            stack.push(node.value);
            node = node.next;
        }

        // 2.将栈顶元素依次弹出，存入数组
        int size = stack.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
        }

        return result;
    }
}
