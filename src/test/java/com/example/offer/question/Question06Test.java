package com.example.offer.question;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question06Test
 * @Author: lhb
 * @Date: 2021/5/17 23:33
 */

@Slf4j
class Question06Test {

    @Test
    void solution() {
        // 初始化一个单向链表：1 -> 5 -> 8 -> 9
        Question06.ListNode head = new Question06.ListNode(1);
        Question06.ListNode listNode1 = new Question06.ListNode(5);
        Question06.ListNode listNode2 = new Question06.ListNode(8);
        Question06.ListNode listNode3 = new Question06.ListNode(9);
        head.setNext(listNode1);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        // 输入
        log.info("input = {}", head);

        // 输出
        int[] result = Question06.solution(head);
        log.info("output = {}", result);
    }
}