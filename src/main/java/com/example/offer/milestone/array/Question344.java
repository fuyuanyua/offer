package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/20 16:31
 * @Description: 反转字符串：https://leetcode.cn/problems/reverse-string/
 *
 * 笔记：
 *      类型：【双指针（左右指针）】
 *      反转字符串、反转数组都是同样的题目，因为字符串实际上就是字符数组
 */

public class Question344 {

    public static void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }

        int left = 0;
        int right = s.length - 1;

        // [1, 2, 3] -> [3, 2, 1]
        // [1, 2, 3, 4] -> [4, 3, 2, 1]
        while (left < right) {
            // 交换元素
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
