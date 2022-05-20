package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/20 14:34
 * @Description: 移动零：https://leetcode.cn/problems/move-zeroes/
 *
 * 笔记：
 *      类型：【双指针-原地修改数组】
 *      此题与Question27：移除元素，采用同样的思想
 *      其实就是先移除数组中所有0，然后再补到数组尾部
 */

public class Question283 {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int slow = 0;
        int fast = 0;

        // 先移除数组中所有0
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        // 再把0都补回到数组尾部
        // 尾部是指[slow, nums.length - 1]这一部分
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
