package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/22 10:51
 * @Description: 二维区域和检索 - 矩阵不可变：https://leetcode.cn/problems/range-sum-query-2d-immutable/
 *
 * 笔记：
 *      类型：【前缀和】
 *      为了简化计算，可以让【前缀和矩阵】比【原矩阵】多出一行和一列，且第一行和第一列都为0，防止边界溢出
 */

public class Question304 {

    public static class NumMatrix {

        private int[][] sumMatrix;

        /**
         * 根据输入的 matrix，构造一个前缀和矩阵 sumMatrix
         * @param matrix
         */
        public NumMatrix(int[][] matrix) {
            // 行数
            int rows = matrix.length + 1;
            // 列数
            int cols = matrix[0].length + 1;
            // sumMatrix 需要比 matrix 多出一行和一列，且第一行和第一列都为0，便于后续计算，防止边界溢出
            sumMatrix = new int[rows][cols];

            // 分两种情况去构造
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // 若是第一行或第一列
                    if (i == 0 || j == 0) {
                        sumMatrix[i][j] = 0;
                        continue;
                    }
                    // 既不是第一行也不是第一列
                    sumMatrix[i][j] = sumMatrix[i][j - 1] + sumMatrix[i - 1][j] + matrix[i - 1][j - 1] - sumMatrix[i - 1][j - 1];
                }
            }
        }

        /**
         * 直接根据前缀和矩阵 sumMatrix 返回结果
         * @param row1
         * @param col1
         * @param row2
         * @param col2
         * @return
         */
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row2 + 1][col1] - sumMatrix[row1][col2 + 1] + sumMatrix[row1][col1];
        }
    }
}
