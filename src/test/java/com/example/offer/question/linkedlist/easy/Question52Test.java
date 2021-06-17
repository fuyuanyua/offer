package com.example.offer.question.linkedlist.easy;

import com.example.offer.datastructure.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question52Test
 * @Author: lhb
 * @Date: 2021/6/17 下午1:55
 */

@Slf4j
class Question52Test {

    @Test
    void solution1() {
        ListNode head1 = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode head2 = new ListNode(9);
        ListNode listNode5 = new ListNode(8);
        // 初始化链表head1：1 -> 2 -> 3 -> 4 -> 5
        head1.setNext(listNode1);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        // 初始化链表head2：9 -> 8 -> 2 -> 3 -> 4 -> 5
        head2.setNext(listNode5);
        listNode5.setNext(listNode1);

        log.info("----------输入----------");
        log.info("head1 = {}", head1);
        log.info("head2 = {}", head2);
        log.info("----------输出----------");
        ListNode result = Question52.solution1(head1, head2);
        log.info("result = {}", result);


    }
}