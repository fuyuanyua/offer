package com.example.offer.question;

import lombok.Data;

import java.util.List;
import java.util.Stack;

/**
 * @Description: 剑指 Offer 24. 反转链表
 *      1.说明：定义一个方法，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *      2.示例：
 *          输入：1 -> 2 -> 3 -> 4
 *          输出：4 -> 3 -> 2 -> 1
 *      3.参考：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * @Author: lhb
 * @Date: 2021/5/21 10:23
 */

public class Question24 {

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
     * 解法1：
     *      思路：利用栈先进后出的特性
     * @param head
     * @return
     */
    public static ListNode solution(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode current = head;

        // 遍历链表，把节点值存入栈
        while (current != null) {
            stack.push(current.value);
            current = current.next;
        }

        // 创建一个虚拟节点，作为返回结果的头节点的前驱
        ListNode fakeNode = new ListNode(-1);
        ListNode cur = fakeNode;

        // 将栈顶节点值依次弹出，组成新链表返回
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            cur.next = new ListNode(stack.pop());
            cur = cur.next;
        }

        return fakeNode.next;
    }
}
