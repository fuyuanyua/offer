package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/19 21:06
 * @Description: 删除排序链表中的重复元素：https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
 *
 * 笔记：
 *      此题与Question26：删除有序数组中的重复项，采用同样的思想
 *      因为是排序的链表，那么重复的节点必定是相邻的
 */

public class Question83 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // 注意：循环终止条件是fast != null，而不是fast.next != null
        // 否则fast指到最后一个节点后就不走循环里的逻辑了，这是错误的
        while (fast != null) {
            if (fast.value != slow.value) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }

        // 最后还要把slow后面的链表断开，例如以下情况：1 -> 2 -> 3 -> 3 -> 3 -> 3
        // 再最后一轮循环结束后，slow指到第一个3，那么后续的链表都要断开
        slow.next = null;

        return head;
    }
}
