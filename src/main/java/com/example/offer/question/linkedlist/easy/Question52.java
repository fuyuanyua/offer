package com.example.offer.question.linkedlist.easy;

import com.example.offer.datastructure.ListNode;

/**
 * @Description: 剑指 Offer 52. 两个链表的第一个公共节点
 * @Author: lhb
 * @Date: 2021/6/17 下午1:01
 *
 * 1.说明：输入两个链表，找出它们的第一个公共节点。
 * 2.限制：
 *      如果两个链表没有交点，返回null。
 *      在返回结果后，两个链表仍须保持原有的结构。
 *      可假定整个链表结构中没有循环。
 *      程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 * 3.示例：
 *      输入：
 *          headA：1 -> 2 -> 3 -> 4 -> 5
 *                      ^
 *                      |
 *          headB：9 -> 8
 *      输出：
 *          3 -> 4 -> 5
 * 4.参考：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 * 5.笔记：
 */

public class Question52 {

    /**
     * 解法1：
     *      思路：
     *          定义一个指针node1初始指向head1，定义一个指针node2初始指向head2，
     *          node1遍历head1，当遍历到null时，node1重新指向head2，
     *          node2遍历head2，当遍历到null时，node2重新指向head1，
     *          当node1和node2指向同一节点时，这个节点就是两个链表的第一个公共节点
     *
     *          当node1和node2同时指向null时，说明node1遍历完了链表1又遍历完了链表2，
     *          node2遍历完了链表2又遍历完了链表1，两个链表没有公共节点
     *      时间复杂度：O(n)
     *      空间复杂度：O(1)
     * @param head1
     * @param head2
     * @return
     */
    public static ListNode solution1(ListNode head1, ListNode head2) {
        ListNode node1 = head1;
        ListNode node2 = head2;

        // 不会死循环，当node1和node2同时为null时，说明两个链表没有公共节点，会跳出循环
        while (node1 != node2) {
            if (node1 != null) {
                node1 = node1.next;
            } else {
                node1 = head2;
            }

            if (node2 != null) {
                node2 = node2.next;
            } else {
                node2 = head1;
            }
        }

        return node1;
    }
}
