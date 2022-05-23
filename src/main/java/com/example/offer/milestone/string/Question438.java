package com.example.offer.milestone.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: lihaibin
 * @Date: 2022/5/23 15:00
 * @Description: 找到字符串中所有字母异位词：https://leetcode.cn/problems/find-all-anagrams-in-a-string/
 *
 * 笔记：
 *      类型：【滑动窗口】
 */

public class Question438 {

    /**
     * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
     * @param s
     * @param p
     * @return
     */
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        // 用于保存结果
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            char key = p.charAt(i);
            need.put(key, need.getOrDefault(key, 0) + 1);
        }
        int needValid = need.size();
        int currentValid = 0;

        // 滑动窗口左边界
        int left = 0;
        // 滑动窗口右边界
        int right = 0;

        // 扩大窗口
        while (right < s.length()) {
            // 这一轮将要移入窗口的字符
            char c = s.charAt(right);
            // 扩大窗口
            right++;
            // 更新数据
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    currentValid++;
                }
            }

            // 缩小窗口
            while (right - left >= p.length()) {
                // 业务逻辑处理
                if (right - left == p.length() && currentValid == needValid) {
                    resultList.add(left);
                }
                // 这一轮将要被移除的字符
                char c1 = s.charAt(left);
                // 缩小窗口
                left++;
                if (need.containsKey(c1)) {
                    if (window.get(c1).equals(need.get(c1))) {
                        currentValid--;
                    }
                    window.put(c1, window.get(c1) - 1);
                }
            }
        }

        return resultList;
    }
}
