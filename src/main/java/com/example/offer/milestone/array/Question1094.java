package com.example.offer.milestone.array;

import com.example.offer.util.DifferenceUtil;

/**
 * @Author: lihaibin
 * @Date: 2022/5/22 17:14
 * @Description: 拼车：https://leetcode.cn/problems/car-pooling/
 *
 * 笔记：
 *      类型：【差分数组】
 *      对此题目进行抽象，就可以使用差分数组的技巧
 *
 *      输入：trips = [[2,1,5],[3,3,7]], capacity = 4
 *      说明：
 *          trips[0] = [2, 1, 5]
 *          表示：在1公里处上来了2位乘客，他们在5公里处下车
 *          trips[1] = [3, 3, 7]
 *          表示：在3公里处上来了3位乘客，他们在7公里处下车
 *      输出：false
 *
 *      输入：trips = [[2,1,5],[3,3,7]], capacity = 5
 *      输出：true
 *
 *      限制：0 <= from < to <= 1000
 */

public class Question1094 {

    public static boolean carPooling(int[][] trips, int capacity) {
        // 因为 0 <= from < to <= 1000，所以初始化一个容量1001的数组存放0到1000公里车上的乘客数，初始化都是0
        int[] nums = new int[1001];
        // 初始化差分数组
        DifferenceUtil differenceUtil = new DifferenceUtil(nums);

        for (int[] trip : trips) {
            // 上车的乘客数
            int count = trip[0];
            // 在 from 公里处，乘客上车
            int from = trip[1];
            // 在 to 公里处，乘客下车，因为已经下车，所以不应该包含此处，所以要 - 1
            int to = trip[2] - 1;
            differenceUtil.increment(from, to, count);
        }

        // 结果数组
        int[] result = differenceUtil.getResult();

        // 遍历结果数组，若出现数量 > capacity，表示超载，返回false，否则返回true
        for (int item : result) {
            if (item > capacity) {
                return false;
            }
        }
        return true;
    }
}
