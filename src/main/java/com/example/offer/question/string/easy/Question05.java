package com.example.offer.question.string.easy;

/**
 * 替换空格：https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
 */
public class Question05 {

    public static String solution1(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
