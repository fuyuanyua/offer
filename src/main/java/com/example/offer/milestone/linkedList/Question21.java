package com.example.offer.milestone.linkedList;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 15:59
 * @Description: 合并两个有序链表：https://leetcode.cn/problems/merge-two-sorted-lists/
 */

public class Question21 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // 合并后链表的哑节点
        ListNode dummy = new ListNode(-1);
        // 指针p：指向合并后链表，当前已合并完成的节点，初始指向哑节点
        ListNode p = dummy;
        // 指针p1：用于遍历list1，初始指向list1头节点
        ListNode p1 = list1;
        // 指针p2：用于遍历list2，初始指向list2头节点
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.value > p2.value) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // 指针不断前进
            p = p.next;
        }

        // 注意：走到这说明list1、list2中的一个链表已经全部被合并到新链表，要补上另一个链表尚未合并的部分
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }

        return dummy.next;
    }
}
