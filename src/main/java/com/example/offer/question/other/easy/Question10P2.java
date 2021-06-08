package com.example.offer.question.other.easy;

/**
 * @Description: 剑指 Offer 10- II. 青蛙跳台阶问题
 * @Author: lhb
 * @Date: 2021/6/8 12:26
 *
 * 1.说明：一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 2.注意：答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 3.示例：
 *      输入：2
 *      输出：2
 * 4.参考：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 */

public class Question10P2 {

    /**
     * 解法1：
     *      思路：
     *          1.青蛙跳上1级台阶，有一种跳法；
     *          2.青蛙跳上2级台阶，有两种跳法：
     *              1：一次直接跳2级
     *              2：分两次跳，每次跳1级
     *          3.青蛙跳上n级台阶（n >= 3）：
     *              1.最后跳1级跳到终点：有f(n - 1)种跳法
     *              2.最后跳2级跳到终点：有f(n - 2)种跳法
     *              3.所以总共有f(n - 1) + f(n - 2)种跳法
     *          4.所以可以归纳得到，青蛙跳台阶问题也是斐波那契数列问题
     *              f(1) = 1
     *              f(2) = 2
     *              f(n) = f(n - 1) + f(n - 2)，n >= 3
     *          5.采用循环的方式求解
     * @param n
     * @return
     */
    public static int solution1(int n) {
        if (n <= 0) {
            return 1;
        }

        if (n <= 2) {
            return n;
        }

        int pre2 = 1;
        int pre1 = 2;
        int current = (pre1 + pre2) % 1000000007;

        for (int i = 3; i <= n; i++) {
            current = (pre1 + pre2) % 1000000007;
            pre2 = pre1;
            pre1 = current;
        }

        return current;
    }
}
