package com.example.offer.milestone.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lihaibin
 * @Date: 2022/5/23 16:21
 * @Description: 无重复字符的最长子串：https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 *
 * 笔记：
 *      类型：【滑动窗口】
 *      此题也用滑动窗口来解，且更简单，可以直接省去need这个map，只是业务逻辑处理的部分需要后移
 */

public class Question3 {

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * 0 <= s.length <= 5 * 10^4
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;
        // 记录最长子串的长度
        int maxLength = 0;

        // 扩大窗口
        while (right < s.length()) {
            // 这一轮将要移入窗口的字符
            char c = s.charAt(right);
            // 扩大窗口
            right++;
            // 更新数据
            window.put(c, window.getOrDefault(c, 0) + 1);

            // 若这个字符的数量超过的1个，说明这个字符重复，缩小窗口
            while (window.get(c) > 1) {
                // 这一轮将要移除的字符
                char c1 = s.charAt(left);
                // 缩小窗口
                left++;
                // 更新数据
                window.put(c1, window.get(c1) - 1);
            }

            // 走到这里，window中保存的字符的个数都是1

            // 业务逻辑处理
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
}

