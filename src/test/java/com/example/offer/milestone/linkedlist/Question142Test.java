package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question142Test {

    @Test
    void detectCycle() {
        // 初始化一个环形链表
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        // 结果 = 1，环形链表入口是值为1的那个节点
        ListNode result = Question142.detectCycle(head);
        log.info("{}", result.value);
    }
}