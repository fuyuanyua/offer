package com.example.offer.milestone.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lihaibin
 * @Date: 2022/5/23 13:47
 * @Description: 字符串的排列：https://leetcode.cn/problems/permutation-in-string/
 *
 * 笔记：
 *      类型：【滑动窗口】
 */

public class Question567 {

    /**
     * s2中是否包含s1的排列
     * 1 <= s1.length, s2.length <= 104
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        // 构造s1的排列所需要满足的条件，key：字符，value：字符的个数
        for (int i = 0; i < s1.length(); i++) {
            char key = s1.charAt(i);
            need.put(key, need.getOrDefault(key, 0) + 1);
        }
        int needValid = need.size();
        int currentValid = 0;

        // 滑动窗口左边界
        int left = 0;
        // 滑动窗口右边界
        int right = 0;

        // 扩大窗口
        while (right < s2.length()) {
            // 这一轮将要移入窗口的字符
            char c = s2.charAt(right);
            // 扩大窗口
            right++;
            // 更新数据
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    currentValid++;
                }
            }

            // 缩小窗口，注意[left, right)，right是开区间
            while (right - left >= s1.length()) {
                // 先进行业务逻辑处理，满足条件，说明找到了
                if (right - left == s1.length() && currentValid == needValid) {
                    return true;
                }
                // 这一轮将要被移除的字符
                char c1 = s2.charAt(left);
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

        return false;
    }
}
