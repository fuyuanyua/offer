package com.example.offer.question;

import lombok.Data;

/**
 * @Description: 剑指 Offer 22. 链表中倒数第k个节点
 *      1.说明：输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 *      2.参考：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * @Author: lhb
 * @Date: 2021/5/19 10:58
 */

public class Question22 {

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
     * 思路：设置快指针和慢指针，快指针先走k-1步，然后慢指针和快指针同时走，
     *      当快指针走到链表最后一个节点，这时慢指针指向的就是目标节点，直接返回
     * @param head
     * @param k
     * @return
     */
    public static ListNode solution(ListNode head, int k) {
        // 特例1：k <= 0无意义，返回空
        if (k <= 0) {
            return null;
        }

        // 特例2：输入空链表，返回空
        if (head == null) {
            return null;
        }

        // 慢指针，初始化指向头节点
        ListNode slow = head;

        // 快指针，初始化指向头节点，并先走k - 1步
        ListNode fast = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
            // 如果fast指针指向了空，说明链表长度小于k，那么也返回空
            if (fast == null) {
                return null;
            }
        }

        // 快指针和慢指针同时走，直到快指针走到链表最后一个节点，这时慢指针指向的就是目标节点，直接返回
        while (fast != null) {
            if (fast.next == null) {
                return slow;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
