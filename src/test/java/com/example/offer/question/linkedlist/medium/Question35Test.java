package com.example.offer.question.linkedlist.medium;

import com.example.offer.datastructure.ComplexListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question35Test {

    @Test
    void solution1() {
    }

    @Test
    void solution2() {
        // 构造一个复杂链表
        ComplexListNode head = new ComplexListNode(0);
        ComplexListNode node1 = new ComplexListNode(1);
        ComplexListNode node2 = new ComplexListNode(2);
        ComplexListNode node3 = new ComplexListNode(3);
        head.next = node1;
        head.random = node3;
        node1.next = node2;
        node1.random = head;
        node2.next = node3;
        node3.random = node1;
        String s1 = printComplexList(head);
        log.info("原链表：{}", s1);

        ComplexListNode copy = Question35.solution2(head);
        String s2 = printComplexList(copy);
        log.info("复制链表：{}", s2);
    }

    /**
     * 打印复杂链表
     * @param head
     * @return
     */
    public static String printComplexList(ComplexListNode head) {
        StringBuilder sb = new StringBuilder();
        ComplexListNode current = head;
        while (current != null) {
            sb.append("[")
                    .append(current.value)
                    .append(",")
                    .append(current.next == null ? "null" : current.next.value)
                    .append(",")
                    .append(current.random == null ? "null" : current.random.value)
                    .append("]");
            sb.append(current.next == null ? "" : " -> ");
            current = current.next;
        }
        return sb.toString();
    }
}