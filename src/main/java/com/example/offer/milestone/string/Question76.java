package com.example.offer.milestone.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lihaibin
 * @Date: 2022/5/22 21:08
 * @Description: 最小覆盖子串：https://leetcode.cn/problems/minimum-window-substring/
 *
 * 笔记：
 *      类型：【滑动窗口】
 *      子串问题，通常都用滑动窗口来解决，且窗口初始化设计成[0, 0)左开右闭
 *      首先：不断扩大窗口直到找到一个解
 *      然后：不断缩小窗口直到找到最优解
 */

public class Question76 {

    public static String minWindow(String s, String t) {

        // key：字符
        // value：题目条件中需要的数量
        Map<Character, Integer> need = new HashMap<>();
        // key：字符
        // value：当前窗口中包含此字符的数量
        Map<Character, Integer> window = new HashMap<>();

        // 初始化 need
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            need.put(key, need.getOrDefault(key, 0) + 1);
        }
        // 要求有几个字符【需要】满足条件所需
        int needValid = need.size();
        // 当前有几个字符【已经】满足条件所需
        int currentValid = 0;

        // 窗口左边界
        int left = 0;
        // 窗口右边界
        int right = 0;

        // 记录最小子串的左边界（闭）
        int start = 0;
        // 记录最小子串的右边界（开）
        int end = Integer.MAX_VALUE;
        // 是否有符合条件的子串
        boolean containSubStr;

        // 首先扩大窗口直到找到一个解
        while (right < s.length()) {
            // 这一轮将要移入窗口的字符
            char c = s.charAt(right);
            // 窗口扩大
            right++;
            // 数据更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                // 当前字母的个数，已经满足条件所需
                if (window.get(c).equals(need.get(c))) {
                    currentValid++;
                }
            }

            // 然后缩小窗口直到找到最优解
            while (currentValid == needValid) {
                // 更新最小子串边界
                if (right - left < end - start) {
                    start = left;
                    end = right;
                }
                // 这一轮将要移出窗口的字符
                char c1 = s.charAt(left);
                // 缩小窗口
                left++;
                // 数据更新
                if (need.containsKey(c1)) {
                    // 当前字符的个数，在移除之后，刚好不满足条件所需
                    if (window.get(c1).equals(need.get(c1))) {
                        currentValid--;
                    }
                    window.put(c1, window.get(c1) - 1);
                }
            }
        }

        return (start == 0 && end == Integer.MAX_VALUE) ? "" : s.substring(start, end);
    }
}
