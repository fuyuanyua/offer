package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/19 19:42
 * @Description: 删除有序数组中的重复项：https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 *
 * 笔记：
 *      设置快慢指针slow和fast
 *      fast先走：
 *          遇到不重复的，slow指针就后移一位，并把nums[fast]赋值给nums[slow]，fast指针后移一位
 *          遇到重复的，fast指针后移一位
 * 注意：
 *      要求原地修改数组，并返回修改后的数组长度
 *      Java中数组长度不可变，假设原始数组长度为n，删除重复项后的数组长度应为k，那么取前k个元素作为最终结果
 */

public class Question26 {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int slow = 0;
        int fast = 1;

        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }
}
