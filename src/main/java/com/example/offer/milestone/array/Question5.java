package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/20 17:16
 * @Description: 最长回文子串：https://leetcode.cn/problems/longest-palindromic-substring/
 *
 * 笔记：
 *      类型：【双指针（左右指针）】
 *      字符串的回文问题，通常都是通过双指针来解决的
 *      一般解决回文问题，都是左、右指针从两端向中间靠拢，此题是左、右指针从中间向外扩散
 * 注意：
 *      字符串就是字符数组，所以解决字符串问题通常就是采用解决数组问题的思路
 */

public class Question5 {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String result = "";
        // 穷举：当每一个点为中心点的情况
        for (int i = 0; i < s.length(); i++) {
            // 若最长回文子串长度是奇数，则有一个中心字符
            String s1 = palindrome(s, i, i);
            // 若是偶数，则有两个中心字符
            String s2 = palindrome(s, i, i + 1);
            // 从当前结果、s1、s2这三者中选出长度最长的
            result = result.length() >= s1.length() ? result : s1;
            result = result.length() >= s2.length() ? result : s2;
        }

        return result;
    }

    /**
     * 寻找以left、right为中心的最长回文子串
     * @param s
     * @param left
     * @param right
     * @return
     */
    public static String palindrome(String s, int left, int right) {
        if (s == null || s.length() == 0) {
            return "";
        }

        while (left >= 0 && right <= s.length() - 1) {
            if (s.charAt(left) == s.charAt(right)) {
                // 左、右指针从中间向外扩散
                left--;
                right++;
            } else {
                break;
            }
        }

        // 最后一轮循环，left--，right++，再下一轮循环条件不满足，跳出
        // 要取最后一轮满足循环条件的left和right，即[left + 1, right - 1]
        // 同时substring的api是[a, b)，所以结果是[left + 1, right - 1 + 1)
        return s.substring(left + 1, right);
    }
}
