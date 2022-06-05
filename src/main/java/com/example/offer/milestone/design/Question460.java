package com.example.offer.milestone.design;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @Author: lihaibin
 * @Date: 2022/6/5 16:33
 * @Description: LFU 缓存：https://leetcode.cn/problems/lfu-cache/
 *
 * 笔记：
 *      【LFU】：淘汰使用次数最少的数据
 */

public class Question460 {

    /**
     * 定义一个数据结构，实现 LFU 功能
     *      1.首先需要将数据按【访问频次】排序
     *      2.若【访问频次】相同的数据有多个，则淘汰掉最旧（什么叫最旧？就是最早put进来的数据）的数据
     */
    public static class LfuCache {

        /**
         * k -> v 的映射
         */
        private Map<Integer, Integer> kToV;

        /**
         * k -> f（访问频次）的映射
         */
        private Map<Integer, Integer> kToF;

        /**
         * f -> k集合（一对多关系，因为相同频次的key可能会有多个） 的映射
         */
        private Map<Integer, LinkedHashSet<Integer>> fToKs;

        /**
         * 最大容量
         */
        private int capacity;

        /**
         * 记录实时容量
         */
        private int size;

        /**
         * 记录最小访问频次
         */
        private int minFrequency;

        public LfuCache(int capacity) {
            this.kToV = new HashMap<>();
            this.kToF = new HashMap<>();
            this.fToKs = new HashMap<>();
            this.capacity = capacity;
            this.minFrequency = 0;
        }

        public int get(int key) {
            // 若 key 不存在，返回-1
            if (!kToV.containsKey(key)) {
                return -1;
            }
            // 若 key 存在，对应的访问频次+1，返回value
            increaseFrequency(key);
            return kToV.get(key);
        }

        public void put(int key, int value) {
            if (capacity == 0) {
                return;
            }
            // 若 key 已存在
            if (kToV.containsKey(key)) {
                // 1.更新value
                // 2.增加访问频次
                kToV.put(key, value);
                increaseFrequency(key);
            }
            // 若 key 不存在
            else {
                // 若超过最大容量，则额外需要移除最少使用的key
                if (size >= capacity) {
                    removeMinFrequencyKey();
                }
                kToV.put(key, value);
                kToF.put(key, 1);
                fToKs.putIfAbsent(1, new LinkedHashSet<>());
                fToKs.get(1).add(key);
                minFrequency = 1;
                size++;
            }
        }

        /**
         * 移除访问频次最小的 key
         *      若最小访问频次存在多个 key，则移除最旧的 key
         */
        private void removeMinFrequencyKey() {
            // 找到访问频次最小的key集合
            LinkedHashSet<Integer> keySet = fToKs.get(minFrequency);
            // 从key集合中找到最旧的key，这就是将要被移除的key
            Iterator<Integer> iterator = keySet.iterator();
            Integer keyToBeDeleted = iterator.next();
            // 更新fToKs
            keySet.remove(keyToBeDeleted);
            if (keySet.isEmpty()) {
                fToKs.remove(minFrequency);
                // 移除这个key之后，需要更新minFrequency吗？按理说是需要的，但是我们无需做其他操作，为什么？
            }
            // 更新kToV
            kToV.remove(keyToBeDeleted);
            // 更新kToF
            kToF.remove(keyToBeDeleted);
            // 更新size
            size--;
        }

        /**
         * 增加 key 对应的访问频次
         * @param key
         */
        private void increaseFrequency(int key) {
            // 更新kToF
            int oldFrequency = kToF.get(key);
            int newFrequency = oldFrequency + 1;
            kToF.put(key, newFrequency);
            // 更新fToKs
            fToKs.get(oldFrequency).remove(key);
            fToKs.putIfAbsent(newFrequency, new LinkedHashSet<>());
            fToKs.get(newFrequency).add(key);
            if (fToKs.get(oldFrequency).isEmpty()) {
                fToKs.remove(oldFrequency);
                if (oldFrequency == minFrequency) {
                    minFrequency = newFrequency;
                }
            }
        }
    }
}
