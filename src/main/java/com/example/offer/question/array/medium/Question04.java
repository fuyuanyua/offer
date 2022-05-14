package com.example.offer.question.array.medium;

/**
 * 二维数组中的查找：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */

public class Question04 {

    public static boolean solution1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        // 根据题目规律，从右上角元素开始搜索
        // 若右上角元素 > target，则排除该列，从剩余的行列式的右上角继续搜索
        // 若右上角元素 < target，则排除该行，从剩余的行列式的右上角继续搜索
        // 时间复杂度：O(m + n)
        int row = 0;
        int col = matrix[0].length - 1;

        while (row <= matrix.length - 1 && col >= 0) {
            int current = matrix[row][col];
            if (current > target) {
                col--;
            } else if (current < target) {
                row++;
            } else {
                return true;
            }
        }

        return false;
    }
}
