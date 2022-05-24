package com.example.offer.milestone.string;

import java.util.*;

/**
 * @Author: lihaibin
 * @Date: 2022/5/24 19:44
 * @Description: 有效的括号：https://leetcode.cn/problems/valid-parentheses/
 *
 * 笔记：
 *      类型：【括号匹配】
 *      可以借助一个辅助栈来实现
 */

public class Question20 {

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        // 辅助栈
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        // 防止类似 "[{()}" 这种情况
        return stack.isEmpty();
    }
}
