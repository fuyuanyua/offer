package com.example.offer.milestone.linkedList;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 21:36
 * @Description: 环形链表：https://leetcode.cn/problems/linked-list-cycle/
 *
 * 笔记：
 *      设置slow和fast两个指针，slow一次走一步，fast一次走两步，若有环，slow和fast终究会相遇
 */

public class Question141 {

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        // 慢指针，每次走一步，初始指向链表头节点
        ListNode slow = head;
        // 快指针，每次走两步，初始指向链表头节点
        ListNode fast = head;

        // fast遍历链表
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // 若相遇，表示有环
            if (slow == fast) {
                return true;
            }
        }

        // 若fast能遍历完链表，表示无环
        return false;
    }
}
