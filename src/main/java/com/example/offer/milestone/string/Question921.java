package com.example.offer.milestone.string;

/**
 * @Author: lihaibin
 * @Date: 2022/5/24 20:27
 * @Description: 使括号有效的最少添加：https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/
 *
 * 笔记：
 *      类型：【括号匹配】
 */

public class Question921 {

    public static int minAddToMakeValid(String s) {
        int leftNeed = 0;
        int rightNeed = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( c == '(') {
                // 对右括号的需求 + 1
                rightNeed++;
            } else if (c == ')') {
                // 对右括号的需求 - 1
                rightNeed--;
                // 若右括号多出了一个，则左括号的需求 + 1，平衡掉多出来的这个右括号
                if (rightNeed == -1) {
                    leftNeed++;
                    rightNeed = 0;
                }
            }
        }

        return leftNeed + rightNeed;
    }
}
