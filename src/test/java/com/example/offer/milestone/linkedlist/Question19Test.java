package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 18:42
 * @Description:
 */

@Slf4j
class Question19Test {

    @Test
    void removeNthFromEnd() {
        // initialize list
        ListNode list1Head = new ListNode(1);
        ListNode list1Node1 = new ListNode(3);
        ListNode list1Node2 = new ListNode(5);
        list1Head.next = list1Node1;
        list1Node1.next = list1Node2;

        ListNode head = Question19.removeNthFromEnd(list1Head, 2);
        log.info("{}", head);
    }

    @Test
    void findNthFromEnd() {
    }
}