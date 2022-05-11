package com.example.offer.question.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 顺时针打印矩阵：https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */

public class Question29 {

    public static int[] solution1(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        // 初始左边界
        int left = 0;
        // 初始右边界
        int right = matrix[0].length - 1;
        // 初始上边界
        int top = 0;
        // 初始下边界
        int bottom = matrix.length - 1;
        // 用于存放结果
        List<Integer> list = new ArrayList<>();
        
        while (true) {
            // 从左往右
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) {
                break;
            }

            // 从上往下
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (right < left) {
                break;
            }

            // 从右往左
            for (int i = right; i >= left ; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if (bottom < top) {
                break;
            }

            // 从下往上
            for (int i = bottom; i >= top ; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (left > right){
                break;
            }
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
