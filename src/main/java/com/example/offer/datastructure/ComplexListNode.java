package com.example.offer.datastructure;

import lombok.Data;

/**
 * 定义一个复杂链表的节点
 */

public class ComplexListNode {

    /**
     * 节点值
     */
    public int value;

    /**
     * 指向下一个节点
     */
    public ComplexListNode next;

    /**
     * 指向任意节点
     */
    public ComplexListNode random;

    public ComplexListNode(int value) {
        this.value = value;
    }
}
