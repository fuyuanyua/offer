package com.example.offer.milestone.linkedlist;

import com.example.offer.datastructure.ListNode;

import java.util.PriorityQueue;

/**
 * @Author: lihaibin
 * @Date: 2022/5/16 16:43
 * @Description: 合并K个升序链表：https://leetcode.cn/problems/merge-k-sorted-lists/
 *
 * 笔记：
 *      与【合并两个有序链表】相比，本道题的难点是在如何快速找出这k个链表节点中的最小值
 *      可以用【优先队列（最小堆）】来解决，用最小堆来维护这k个链表的节点，那么能在O(1)找到最小值，即堆顶元素
 */

public class Question23 {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // 合并后链表的哑节点
        ListNode dummy = new ListNode(-1);
        // 指针p：指向合并后链表，当前已合并完成的节点，初始指向哑节点
        ListNode p = dummy;
        // 最小堆
        int k = lists.length;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(k, (a, b) -> a.value - b.value);

        // 先把这k个链表的头节点都加入最小堆
        for (ListNode list : lists) {
            if (list != null) {
                priorityQueue.add(list);
            }
        }

        while (!priorityQueue.isEmpty()) {
            // 获取这k个链表节点中的最小节点，合并到新链表
            ListNode min = priorityQueue.poll();
            p.next = min;
            // 把最小节点的下一个节点放入最小堆
            if (min.next != null) {
                priorityQueue.add(min.next);
            }
            // 指针不断前进
            p = p.next;
        }

        return dummy.next;
    }
}
