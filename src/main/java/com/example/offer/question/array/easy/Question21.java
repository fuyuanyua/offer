package com.example.offer.question.array.easy;

/**
 * 调整数组顺序使奇数位于偶数前面：https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */

public class Question21 {

    public static int[] solution1(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        // 定义两个指针p1，p2
        // p1初始指向数组第一个元素
        // p2初始指向数组最后一个元素，向前遍历
        int length = array.length;
        int p1 = 0;
        int p2 = length - 1;

        while (p1 < p2) {
            // p1向后遍历，直到遇到偶数
            while (p1 < p2 && array[p1] % 2 == 1) {
                p1++;
            }

            // p2向前遍历，直到遇到奇数
            while (p1 < p2 && array[p2] % 2 == 0) {
                p2--;
            }

            // 交换p1和p2所指的元素
            if (p1 < p2) {
                int temp = array[p1];
                array[p1] = array[p2];
                array[p2] = temp;
            }
        }

        return array;
    }
}
