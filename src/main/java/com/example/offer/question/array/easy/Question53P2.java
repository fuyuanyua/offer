package com.example.offer.question.array.easy;

/**
 * @Description: 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * @Author: lhb
 * @Date: 2021/6/3 13:20
 *
 * 1.说明：
 *      一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 *      在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * 2.示例：
 *      输入：
 *          [0,1,2,3,4,5,6,7,9]
 *      输出：
 *          8
 * 3.参考：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 * 4.笔记：
 *      排序数组查找：优先考虑二分法（二分法查找时间复杂度O(logn)）
 */

public class Question53P2 {

    /**
     * 解法1：
     *      思路：
     *          1.先假设数组长度为n：
     *              假设n = 5，那么数组长度为5，每个数字在0～4范围之内，所以数组为：[0， 1， 2， 3， 4]，
     *              可以发现特点：每个元素的值必定等于其下标，即nums[i] == i
     *          2.但题目要求数组长度为n-1：
     *              假设n = 5，那么数组长度为4，每个数字在0～4范围之内，所以0～4必定有一个数字不在数组中，
     *              所以数组可以为：[0， 1， 3， 4]，可以发现从某一个元素开始，元素的值与其下标不再相等，
     *              而这个元素的下标正好是缺失的值，也就是从nums[2]开始，nums[2] != 3，这个元素后面的
     *              元素都不再符合nums[i] == i，所以2就是缺失的值
     *          3.通过二分法找出第一个下标与值不相等的元素，其下标就是数组缺失的值
     * @param nums
     * @return
     */
    public static int solution1(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid;

        // 二分法
        while (left <= right) {
            mid = (left + right) / 2;
            // 如果mid所指的元素值等于下标
            // 说明要寻找的元素在mid的右边
            if (nums[mid] == mid) {
                left = mid + 1;
            } else { // 否则说明要寻找的元素在mid的左边
                right = mid - 1;
            }
        }
        return left;
    }
}
