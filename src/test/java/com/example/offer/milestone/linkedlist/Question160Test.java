package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question160Test {

    @Test
    void getIntersectionNode() {
        ListNode headA = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode headB = new ListNode(5);
        headA.next = node1;
        node1.next = node2;
        node2.next = node3;
        headB.next = node1;

        // 结果 = 2，相交节点是值为2的节点
        ListNode result = Question160.getIntersectionNode(headA, headB);
        log.info("{}", result.value);
    }
}