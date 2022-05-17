package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 21:05
 * @Description: 链表的中间结点：https://leetcode.cn/problems/middle-of-the-linked-list/
 *
 * 笔记：
 *      设置slow和fast两个指针，slow一次走一步，fast一次走两步，当fast指针走到链表尾，slow指针刚好走到链表中间节点
 * 注意：
 *      这类快慢指针问题，fast指针一次走两步，若不是环形链表，fast有可能会走到null
 *      所以while循环遍历链表的时候，一定要先判断fast指针本身是否等于null，否则fast.next会空指针
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
