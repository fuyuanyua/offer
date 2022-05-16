package com.example.offer.milestone.linkedList;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question876Test {

    @Test
    void middleNode() {
        // 初始化list
        ListNode list1Head = new ListNode(1);
        ListNode list1Node1 = new ListNode(3);
        ListNode list1Node2 = new ListNode(5);
        list1Head.next = list1Node1;
        list1Node1.next = list1Node2;

        ListNode result = Question876.middleNode(list1Head);
        // 结果 = 3
        log.info("{}", result.value);
    }
}