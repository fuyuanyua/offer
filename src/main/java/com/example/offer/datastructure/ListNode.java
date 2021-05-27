package com.example.offer.datastructure;

import lombok.Data;

/**
 * @Description: 定义一个单向链表节点
 * @Author: lhb
 * @Date: 2021/5/26 20:40
 */

@Data
public class ListNode {

    /**
     * 节点值
     */
    public int value;

    /**
     * 后继节点
     */
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}
