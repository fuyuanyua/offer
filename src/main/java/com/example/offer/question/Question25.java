package com.example.offer.question;

import lombok.Data;

/**
 * @Description: 合并两个排序的链表
 *      1.说明：输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *      2.参考：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 * @Author: lhb
 * @Date: 2021/5/20 13:12
 */

public class Question25 {

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
     * 思路：递归
     * @param l1 递增排序的链表1
     * @param l2 递增排序的链表2
     * @return 合并后的递增排序的链表
     */
    public static ListNode solution(ListNode l1, ListNode l2) {
        // 如果l1为空或者l2为空了，就跳出递归
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        // 新建一个头节点，作为合并后的链表的头节点
        ListNode mergedHead = null;

        // 比较l1头节点和l2头节点的值
        // 如果l1.value <= l2.value，把l1的头节点当作合并后链表的头节点
        if (l1.value <= l2.value) {
            mergedHead = l1;
            // 递归寻找后继
            mergedHead.next = solution(l1.next, l2);
        } else { // 否则把l2的头节点当作合并后链表的头节点
            mergedHead = l2;
            // 递归寻找后继
            mergedHead.next = solution(l1, l2.next);
        }

        return mergedHead;
    }
}
