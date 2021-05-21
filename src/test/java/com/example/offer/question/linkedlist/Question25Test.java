package com.example.offer.question.linkedlist;

import com.example.offer.question.linkedlist.Question25;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question25Test
 * @Author: lhb
 * @Date: 2021/5/20 17:35
 */

@Slf4j
class Question25Test {

    @Test
    void solution() {
        // 初始化一个递增排序的单向链表l1：1 -> 3 -> 5 -> 7
        Question25.ListNode l1 = new Question25.ListNode(1);
        Question25.ListNode node1 = new Question25.ListNode(3);
        Question25.ListNode node2 = new Question25.ListNode(5);
        Question25.ListNode node3 = new Question25.ListNode(7);
        l1.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // 初始化一个递增排序的单向链表l2：2 -> 4 -> 6 -> 8
        Question25.ListNode l2 = new Question25.ListNode(2);
        Question25.ListNode node4 = new Question25.ListNode(4);
        Question25.ListNode node5 = new Question25.ListNode(6);
        Question25.ListNode node6 = new Question25.ListNode(8);
        l2.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        // 输入
        log.info("input = {}, {}", l1, l2);

        // 输出
        Question25.ListNode result = Question25.solution(l1, l2);
        log.info("output = {}", result);
    }
}