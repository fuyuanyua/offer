package com.example.offer.milestone.linkedList;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question141Test {

    @Test
    void hasCycle() {
        // 初始化一个环形链表
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        boolean result = Question141.hasCycle(head);
        log.info("{}", result ? "是环形链表" : "不是环形链表");
    }
}