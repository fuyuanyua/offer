package com.example.offer.question.linkedlist.easy;

import com.example.offer.question.linkedlist.easy.Question22;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question22Test
 * @Author: lhb
 * @Date: 2021/5/19 15:32
 */

@Slf4j
class Question22Test {

    @Test
    void solution() {
        // 初始化一个单向链表：5 -> 8 -> 4 -> 10 -> 7
        Question22.ListNode head = new Question22.ListNode(5);
        Question22.ListNode node1 = new Question22.ListNode(8);
        Question22.ListNode node2 = new Question22.ListNode(4);
        Question22.ListNode node3 = new Question22.ListNode(10);
        Question22.ListNode node4 = new Question22.ListNode(7);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        int k = 3;

        // 输入
        log.info("input = {}, {}", head, k);

        // 输出
        Question22.ListNode result = Question22.solution(head, k);
        log.info("output = {}", result);
    }
}