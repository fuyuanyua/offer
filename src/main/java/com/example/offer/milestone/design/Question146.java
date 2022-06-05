package com.example.offer.milestone.design;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lihaibin
 * @Date: 2022/6/2 19:48
 * @Description: LRU 缓存：https://leetcode.cn/problems/lru-cache/
 *
 * 笔记：
 *      【LRU】：淘汰最久没被使用的数据
 */

public class Question146 {

    /**
     * 首先：定义 LRU Cache 的双向链表的节点
     */
    public static class Node {

        public int key;

        public int value;

        /**
         * 指向后继
         */
        public Node next;

        /**
         * 指向前驱
         */
        public Node pre;

        public Node() {}

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * 然后：定义 LRU Cache 的双向链表
     */
    public static class DoublyLinkedList {

        /**
         * 哑头节点
         */
        private Node dummyHead;

        /**
         * 哑尾节点
         */
        private Node dummyTail;

        public DoublyLinkedList() {
            this.dummyHead = new Node();
            this.dummyTail = new Node();
            dummyHead.next = dummyTail;
            dummyTail.pre = dummyHead;
        }

        /**
         * 向链表尾添加节点
         * @param node
         */
        public void addToTail(Node node) {
            node.next = dummyTail;
            node.pre = dummyTail.pre;
            dummyTail.pre.next = node;
            dummyTail.pre = node;
        }

        /**
         * 把指定节点a从双向链表中移除
         *      1.节点a的后继的前驱指向节点a的前驱
         *      2.节点a的前驱的后继指向节点a的后继
         * @param node
         */
        public void remove(Node node) {
            node.next.pre = node.pre;
            node.pre.next = node.next;
        }

        /**
         * 从链表头移除节点，并返回该节点
         * @return
         */
        public Node removeFromHead() {
            if (dummyHead.next == dummyTail) {
                return null;
            }
            // 将要移除的节点
            Node headToBeRemoved = dummyHead.next;
            remove(headToBeRemoved);
            return headToBeRemoved;
        }
    }

    /**
     * 设计一个数据结构，实现 LRU 功能
     *      定义：采用尾插法，最新访问或者插入的节点放在链表尾；最久未使用的节点处在链表头
     */
    public static class LruCache {

        /**
         * LRU Cache 的最大容量
         */
        private int capacity;

        private int size;

        private Map<Integer, Node> map;

        private DoublyLinkedList linkedList;

        public LruCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.map = new HashMap<>();
            this.linkedList = new DoublyLinkedList();
        }

        public int get(int key) {
            // 从map取
            Node node = map.get(key);
            // 若取不到
            if (node == null) {
                return -1;
            }
            // 若取到，把node移动到到链表尾
            linkedList.remove(node);
            linkedList.addToTail(node);
            return node.value;
        }

        public void put(int key, int value) {
            boolean containsKey = map.containsKey(key);
            // 若key已经存在
            // 1.更新节点value
            // 2.将节点移到尾节点
            if (containsKey) {
                Node node = map.get(key);
                node.value = value;
                linkedList.remove(node);
                linkedList.addToTail(node);
            }
            // 若key不存在，新建节点
            else {
                Node newNode = new Node(key, value);
                // 若超过最大容量
                // 1.移除头节点，移除缓存
                // 2.放入尾节点，放入缓存
                if (size >= capacity) {
                    Node head = linkedList.removeFromHead();
                    map.remove(head.key);
                    linkedList.addToTail(newNode);
                    map.put(key, newNode);
                }
                // 若没超过最大容量
                // 1.放入尾节点，放入缓存
                else {
                    linkedList.addToTail(newNode);
                    map.put(key, newNode);
                    size++;
                }
            }
        }
    }
}
