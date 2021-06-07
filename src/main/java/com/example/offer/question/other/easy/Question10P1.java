package com.example.offer.question.other.easy;

/**
 * @Description: 斐波那契数列
 * @Author: lhb
 * @Date: 2021/6/7 16:53
 *
 * 1.说明：
 *      写一个方法，输入n，求斐波那契（Fibonacci）数列的第n项（即 F(N)）。
 *      F(0) = 0
 *      F(1) = 1
 *      F(N) = F(N - 1) + F(N - 2), 其中 N > 1
 * 2.注意：答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 3.示例：
 *      输入：5
 *      输出：5
 * 4.参考：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * 5.笔记：
 */

public class Question10P1 {

    /**
     * 解法1：
     *      思路：递归
     *      缺点：
     *          存在大量的重复计算，例如f(10)要先求得f(9)和f(8)，而f(9)又要先求得f(8)和f(7)，
     *          那么f(8)就重复计算了，效率极低，时间复杂度是指数级别的，可以测试n = 50，直接超时
     * @param n
     * @return
     */
    public static int solution1(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return ((solution1(n - 1) + solution1(n - 2)) % 1000000007);
    }

    /**
     * 题解2：
     *      思路：循环
     * @param n
     * @return
     */
    public static int solution2(int n) {
        if (n <= 1) {
            return n;
        }

        int pre2 = 0;
        int pre1 = 1;
        int current = (pre1 + pre2) % 1000000007;

        for (int i = 2; i <= n ; i++) {
            current = (pre1 + pre2) % 1000000007;
            pre2 = pre1;
            pre1 = current;
        }

        return current;
    }
}
