package com.example.offer.question;

import lombok.Data;

/**
 * @Description: 剑指 Offer 18. 删除链表的节点
 *      1.说明：给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点，返回删除后的链表的头节点。
 *      2.参考：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * @Author: lhb
 * @Date: 2021/5/18 23:04
 */

public class Question18 {

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
     * 思路：遍历链表，如果找到一个节点的值等于目标值，则删除这个节点。
     *      1.删除单向链表某个节点的方法：直接将该节点的前驱指向该节点的后继
     * @param head
     * @param value
     * @return
     */
    public static ListNode solution(ListNode head, int value) {
        // 如果头节点为空，直接返回空
        if (head == null) {
            return null;
        }

        // 如果头节点就是要删除的节点，直接返回头节点的下一个节点
        if (head.value == value) {
            return head.next;
        }

        // 创建一个虚拟节点，作为头节点的前驱
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next = head;

        // 定义当前指针，指向当前节点。
        // 用于遍历链表，初始化指向头节点
        ListNode current = head;
        // 定义前驱指针，指向当前节点的前驱
        ListNode pre = fakeNode;

        // 从头节点开始遍历链表
        while (current != null) {
            // 如果当前节点就是要删除的节点
            if (current.value == value) {
                // 把当前节点的前驱指向当前节点的后继（也就是删除该节点），然后直接返回头节点
                pre.next = current.next;
                return head;
            }
            // 否则前驱指针和当前指针都向后移一步
            pre = current;
            current = current.next;
        }
        // 返回头节点
        return head;
    }
}
