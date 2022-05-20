package com.example.offer.milestone.array;

/**
 * @Author: lihaibin
 * @Date: 2022/5/20 14:04
 * @Description: 移除元素：https://leetcode.cn/problems/remove-element/
 *
 * 笔记：
 *      类型：【双指针（快慢指针）-原地修改数组】
 *      此题与Question26：删除有序数组中的重复项，采用同样的思想
 */

public class Question27 {

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        // 最后返回的数组长度是slow，其实是(slow - 1) + 1
        // 最后一次循环，先赋值，再slow++，那么可以保证0到slow -1索引位都是不含val的
        // 所以结果数组的最后索引位是：slow - 1
        return slow;
    }
}
