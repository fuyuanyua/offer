package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 18:04
 * @Description: 删除链表的倒数第 N 个结点：https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 *
 * 笔记：
 *      剑指 Offer 22. 链表中倒数第k个节点：https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */

public class Question19 {

    /**
     * 删除链表的倒数第 N 个结点
     *      1.首先找到倒数第 N + 1 个节点
     *      2.然后改变这个节点的next指针指向即可
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        // 同样创建哑节点，防止删除第一个节点出现空指针的情况
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // 删除链表的倒数第 N 个结点，要先找到倒数第 N + 1 个节点
        ListNode node = findNthFromEnd(dummy, n + 1);
        // 改变倒数第 N + 1 个节点的next指针指向，即删除掉了倒数第 N 个节点
        node.next = node.next.next;

        return dummy.next;
    }

    /**
     * 获取链表的倒数第 N 个节点
     * @param head
     * @param n
     * @return
     */
    public static ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        // slow指针先走 N - 1 步
        for (int i = 0; i < n - 1; i++) {
            slow = slow.next;
        }
        // slow指针和fast指针一起走，当slow走到最后一个，fast刚好走好倒数第 N 个
        while (slow.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
