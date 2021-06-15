package com.example.offer.question.hash.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description: 剑指 Offer 50. 第一个只出现一次的字符
 * @Author: lhb
 * @Date: 2021/6/15 下午12:17
 *
 * 1.说明：在字符串s中找出第一个只出现一次的字符。如果没有，返回一个单空格。s只包含小写字母。
 * 2.限制：
 *      0 <= s的长度 <= 50000
 *      s只包含小写字母
 * 3.示例：
 *      输入：
 *          "abaccdeff"
 *      输出：
 *          "b"
 * 4.参考：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 * 5.笔记：
 *      哈希表：
 *          1.HashMap：
 *              遍历map并不保证插入的顺序
 *              因为HashMap底层使用数组保存每个节点（每个节点是一对键值对），put的时候对key取hash，
 *              所以节点散列到了数组的各处，遍历map不会按照插入的顺序
 *          2.LinkedHashMap：
 *              保证了按照插入顺序遍历map
 *              LinkedHashMap继承自HashMap，但每个节点额外维护了before和after，
 *              也就是通过双向链表，维护了插入的顺序
 *              查看源码：put（未重写） -> putVal（未重写） -> newNode（重写） -> linkNodeLast（私有方法）
 *              LinkedHashMap重写了newNode方法，并调用了linkNodeLast方法，维护了节点的前驱和后继
 */

public class Question50 {

    /**
     * 解法1：
     *      思路：
     *          使用额外一个有序哈希表（保证插入顺序），Java中是LinkedHashMap，
     *          遍历字符数组，将结果记录到map，key为字符，value为字符出现的次数，
     *          然后遍历map，得到结果
     *      时间复杂度：遍历一次字符数组，遍历一次哈希表，总时间复杂度还是O(n)
     *      空间复杂度：最多保存26个小写字母的key，所以使用常量的额外空间，为O(1)
     * @param s
     * @return
     */
    public static char solution1(String s) {
        char result = ' ';
        if (s.isEmpty()) {
            return result;
        }

        // LinkedHashMap保证了遍历map是按照插入的顺序
        Map<Character, Integer> map = new LinkedHashMap<>(26);
        char[] charArray = s.toCharArray();
        // key保存字符，value保存字符出现的次数
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 遍历map找到第一个出现1次的key返回
        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        // 否则返回一个空格
        return result;
    }
}
