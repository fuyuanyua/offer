package com.example.offer.milestone.linkedList;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 16:27
 * @Description:
 */

@Slf4j
class Question21Test {

    @Test
    void mergeTwoLists() {
        // initialize list1
        ListNode list1Head = new ListNode(1);
        ListNode list1Node1 = new ListNode(3);
        ListNode list1Node2 = new ListNode(5);
        list1Head.next = list1Node1;
        list1Node1.next = list1Node2;

        // initialize list2
        ListNode list2Head = new ListNode(2);
        ListNode list2Node1 = new ListNode(4);
        ListNode list2Node2 = new ListNode(6);
        ListNode list2Node3 = new ListNode(8);
        ListNode list2Node4 = new ListNode(10);
        list2Head.next = list2Node1;
        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        list2Node3.next = list2Node4;

        ListNode mergedList = Question21.mergeTwoLists(list1Head, list2Head);
        log.info("{}", mergedList);
    }
}