package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 22:23
 * @Description: 环形链表 II：https://leetcode.cn/problems/linked-list-cycle-ii/
 *
 * 笔记：
 *      相比较于Question141：环形链表，此题要求找出环形链表的入口
 *      1.设置slow和fast两个指针，slow一次走一步，fast一次走两步，先找到相遇的节点
 *      2.当slow和fast相遇后，将其中一个指针归位（重新指向head），
 *      3.然后slow和fast都再以每次一步的步伐继续向后遍历，再次相遇的节点就是环形链表入口
 */

public class Question142 {

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        // 慢指针，每次走一步，初始指向链表头节点
        ListNode slow = head;
        // 快指针，每次走两步，初始指向链表头节点
        ListNode fast = head;

        // fast遍历链表
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // 找到了相遇节点，此时slow和fast都指向相遇节点
            if (slow == fast) {
                break;
            }
        }

        // 若无环，返回null
        if (fast == null || fast.next == null) {
            return null;
        }

        // 若有环
        // slow重新指向head，然后继续遍历，slow和fast每次都同时走一步
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // 找到环形链表入口，返回slow和fast都可以，都指向环形链表入口节点
        return slow;
    }
}
