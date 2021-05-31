package com.example.offer.question.array.easy;

import java.util.Arrays;
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

    /**
     * 解法2：
     *      思路：先对数组排序，然后遍历数组，相邻元素相等则表示找到了重复数字
     *      优点：无需额外空间
     *      缺点：排序时间复杂度O(nlogn)
     * @param nums
     * @return
     */
    public static int solution2(int[] nums) {
        // 先对数组按升序排序
        Arrays.sort(nums);
        int length = nums.length;
        // 遍历数组，比较当前元素和前一个元素是否相等，相等则表示找到
        for (int i = 1; i < length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i - 1];
            }
        }
        // 遍历完数组都没找到重复的数字，返回-1
        return -1;
    }

    /**
     * 解法3：
     *      思路：
     *          遍历数组，通过交换的操作，使元素下标与元素值对应（例如元素下标为0，值也要为0），
     *          如果一个下标对应了多个元素，则找出了重复的值
     *      优点：遍历数组，时间复杂度O(n)，每次判断与交换，时间复杂度O(1)，无使用额外空间，目前最优解
     * @param nums
     * @return
     */
    public static int solution3(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            // 如果值与下标相等，继续往后遍历
            if (nums[i] == i) {
                continue;
            } else { // 如果值与下标不相等
                // 则打算将此元素交换到值所对应的下标位置
                // 交换前先对比两个位置的值，如果相等，则找到了重复的值
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                // 如果不相等，则交换
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}
