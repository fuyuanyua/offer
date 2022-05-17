package com.example.offer.milestone.linkedList;

import com.example.offer.datastructure.ListNode;

/**
 * @Author: lihaibin
 * @Date: 2022/5/17 10:53
 * @Description: 相交链表：https://leetcode.cn/problems/intersection-of-two-linked-lists/
 *
 * 笔记：
 *      设置双指针，p1遍历链表a，p2遍历链表b
 *      当p1遍历完链表a后，从链表b的头部开始遍历
 *      当p2遍历完链表b后，从链表a的头部开始遍历
 *      当p1遍历完了链表a和链表b，p2也遍历完了链表b和链表a，他们p1和p2这时同时指向：
 *          * 相交节点（相交的情况）
 *          * null（不相交的情况）
 */

public class Question160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            // p1指针若走到了链表a的尾部，那么转到链表b头部
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            // p2指针若走到了链表b的尾部，那么转到链表a头部
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        // 返回p1或者p2都可以，他们都指向相交链表的起始节点
        // 注意：若链表a和链表b没有相交，能得到正确结果吗？
        // 能，p1走完链表a和链表b，指向null，p2走完链表b和链表a，也指向null，这时while为false，退出循环，返回null
        return p1;
    }
}
