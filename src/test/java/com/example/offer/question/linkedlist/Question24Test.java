package com.example.offer.question.linkedlist;

import com.example.offer.question.linkedlist.Question24;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question24Test
 * @Author: lhb
 * @Date: 2021/5/21 11:15
 */

@Slf4j
class Question24Test {

    @Test
    void solution1() {
        // 初始化一个单向链表：2 -> 3 -> 4 -> 5 -> 10
        Question24.ListNode head = new Question24.ListNode(2);
        Question24.ListNode node1 = new Question24.ListNode(3);
        Question24.ListNode node2 = new Question24.ListNode(4);
        Question24.ListNode node3 = new Question24.ListNode(5);
        Question24.ListNode node4 = new Question24.ListNode(10);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        // 输入
        log.info("input = {}", head);

        // 输出
        Question24.ListNode result = Question24.solution1(head);
        log.info("output = {}", result);
    }

    @Test
    void solution2() {
        // 初始化一个单向链表：2 -> 3 -> 4 -> 5 -> 10
        Question24.ListNode head = new Question24.ListNode(2);
        Question24.ListNode node1 = new Question24.ListNode(3);
        Question24.ListNode node2 = new Question24.ListNode(4);
        Question24.ListNode node3 = new Question24.ListNode(5);
        Question24.ListNode node4 = new Question24.ListNode(10);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        // 输入
        log.info("input = {}", head);

        // 输出
        Question24.ListNode result = Question24.solution2(head);
        log.info("output = {}", result);
    }
}