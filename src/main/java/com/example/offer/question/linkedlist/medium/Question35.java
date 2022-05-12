package com.example.offer.question.linkedlist.medium;

import com.example.offer.datastructure.ComplexListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 复杂链表的复制：https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 */

public class Question35 {

    /**
     * 不用考虑random指针的情况下，一个简单单向链表的复制
     * @param head
     * @return
     */
    public static ComplexListNode solution1(ComplexListNode head) {
        // 指向当前遍历到的原链表节点
        ComplexListNode current = head;
        // 复制链表的哑节点
        ComplexListNode dummy = new ComplexListNode(-1);
        // 指向复制链表，当前要构建节点的前一个节点
        ComplexListNode pre = dummy;

        while (current != null) {
            ComplexListNode node = new ComplexListNode(current.value);
            pre.next = node;
            pre = pre.next;
            current = current.next;
        }

        return dummy.next;
    }

    /**
     * 复杂链表的复制：
     *      第一遍遍历：构造不考虑random指针的复制链表，并用map存储（node -> node'）的映射关系
     *      第二遍遍历：完善复制链表的random指针
     * @param head
     * @return
     */
    public static ComplexListNode solution2(ComplexListNode head) {
        // key：原链表节点
        // value：复制链表对应的节点
        Map<ComplexListNode, ComplexListNode> map = new HashMap<>();

        // 指向当前遍历到的原链表节点
        ComplexListNode current = head;
        // 复制链表的哑节点
        ComplexListNode dummy = new ComplexListNode(-1);
        // 指向复制链表，当前要构建节点的前一个节点
        ComplexListNode pre = dummy;

        // 第一遍遍历原链表，构建不包含random指针的复制链表，以及原链表节点和复制链表节点的映射关系
        while (current != null) {
            ComplexListNode node = new ComplexListNode(current.value);
            pre.next = node;
            map.put(current, node);
            pre = pre.next;
            current = current.next;
        }

        // 指针归位，第二遍遍历原链表，构建复制链表每个节点的random指针
        current = head;
        while (current != null) {
            ComplexListNode random = current.random;
            ComplexListNode current1 = map.get(current);
            if (random == null) {
                current1.random = null;
            } else {
                ComplexListNode random1 = map.get(random);
                current1.random = random1;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
