package com.example.offer.question.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 剑指 Offer 03. 数组中重复的数字
 * @Author: lhb
 * @Date: 2021/5/31 11:20
 *
 * 1.说明：
 *      在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 *      数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 2.限制：2 <= n <= 100000
 * 3.示例：
 *      输入：
 *          [2, 3, 1, 0, 2, 5, 3]
 *      输出：
 *          2或3
 *
 * 4.参考：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */

public class Question03 {

    /**
     * 解法1：
     *      思路：
     *          额外利用一个哈希表，Java中HashMap或者HashSet都行，
     *          从头到尾遍历这个数组，每遍历到一个元素，判断哈希表有无这个元素：
     *          若无，加入哈希表；若有，则找到了一个重复的数字
     *      优点：遍历这个数组，时间复杂度O(n)
     *      缺点：空间换时间，额外需要一个O(n)的空间复杂度
     * @param nums
     * @return
     */
    public static int solution1(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int current = nums[i];
            // 如果哈希表中有这个元素，表示这个数字重复，直接返回
            if (hashSet.contains(current)) {
                return current;
            }
            // 如果哈希表中没有这个元素，则加入这个元素
            hashSet.add(current);
        }
        // 遍历完数组都没找到重复的数字，返回-1
        return -1;
    }
}
