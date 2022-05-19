package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question83Test {

    @Test
    void deleteDuplicates() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node1;
        node1.next = node2;

        ListNode result = Question83.deleteDuplicates(head);
        log.info("{}", result);
    }
}