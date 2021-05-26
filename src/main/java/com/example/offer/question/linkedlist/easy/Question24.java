package com.example.offer.question.linkedlist.easy;

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
     *      思路：额外使用一个辅助栈，利用栈先进后出的特性
     * @param head
     * @return
     */
    public static ListNode solution1(ListNode head) {
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

    /**
     * 解法2：
     *      思路：直接调整每个节点next的指向，由指向后继调整到指向前驱，需要定义三个指针
     * @param head
     * @return
     */
    public static ListNode solution2(ListNode head) {
        // 当前指针，指向当前节点，用于遍历链表，初始化指向头节点
        ListNode current = head;
        // 前驱指针，指向当前节点的原前驱
        ListNode pre = null;
        // 后继指针，指向当前节点的原后继
        ListNode temp = null;

        // 遍历链表
        while (current != null) {
            // 临时保存当前节点的原后继，否则更改当前节点的next后，链表会断开，找不到原后继
            temp = current.next;
            current.next = pre;

            // 前驱指针和当前指针都后移一步
            pre = current;
            current = temp;
        }
        return pre;
    }
}
