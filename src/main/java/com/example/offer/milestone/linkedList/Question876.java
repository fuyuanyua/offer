package com.example.offer.milestone.linkedList;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 21:05
 * @Description: 链表的中间结点：https://leetcode.cn/problems/middle-of-the-linked-list/
 */

public class Question876 {

    public static ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        // 慢指针，每次走一步，初始指向链表头节点
        ListNode slow = head;
        // 快指针，每次走两步，初始指向链表头节点
        ListNode fast = head;

        // 注意：因为fast每次走两步，所以当链表长度为偶数时，fast会走到null
        // 所以要先判断fast != null，避免fast.next != null产生空指针
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 当快指针走到链表尾，慢指针刚好走到链表中间节点
        return slow;
    }
}
