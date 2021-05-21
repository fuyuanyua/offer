package com.example.offer.question.linkedlist;

import com.example.offer.question.linkedlist.Question18;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question18Test
 * @Author: lhb
 * @Date: 2021/5/19 09:14
 */

@Slf4j
class Question18Test {

    @Test
    void solution() {
        // 初始化一个单向链表：5 -> 6 -> 7 -> 8
        Question18.ListNode head = new Question18.ListNode(5);
        Question18.ListNode node1 = new Question18.ListNode(6);
        Question18.ListNode node2 = new Question18.ListNode(7);
        Question18.ListNode node3 = new Question18.ListNode(8);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // 待删除节点的值
        int target = 7;

        // 输入
        log.info("input = {}, {}", head, target);

        // 输出
        Question18.ListNode result = Question18.solution(head, target);
        log.info("output = {}", result);
    }
}