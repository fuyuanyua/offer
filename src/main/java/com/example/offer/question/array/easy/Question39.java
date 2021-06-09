package com.example.offer.question.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 剑指 Offer 39. 数组中出现次数超过一半的数字
 * @Author: lhb
 * @Date: 2021/6/8 14:22
 *
 * 1.说明：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 2.限制：1 <= 数组长度 <= 50000，且一定存在这个数字
 * 3.示例：
 *      输入：
 *          [1, 2, 3, 2, 2, 2, 5, 4, 2]
 *      输出：
 *          2
 * 4.参考：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 */

public class Question39 {

    /**
     * 题解1：
     *      思路：先对数组升序排序，因为数字出现次数超过数组长度一半，那么排序后数组中间的数字必定是目标数字
     *      时间复杂度：排序的时间复杂度是O(nlogn)
     *      空间复杂度：无额外空间
     * @param nums
     * @return
     */
    public static int solution1(int[] nums) {
        Arrays.sort(nums);
        int mid = (0 + (nums.length - 1)) / 2;
        return nums[mid];
    }

    /**
     * 题解2：
     *      思路：
     *          遍历数组，把每个数字的次数记录到哈希表，key为此数字的值，value为此数字出现的次数，
     *          返回出现次数大于（数组长度 / 2）的数字
     *      时间复杂度：O(n)
     *      空间复杂度：O(n)
     * @param nums
     * @return
     */
    public static int solution2(int[] nums) {
        int halfLength = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>(16);

        for (int num : nums) {
            // 根据名为num的key取value，若取得到则返回value，若取不到则返回默认值
            Integer oldCount = map.getOrDefault(num, 0);
            int newCount = oldCount + 1;
            if (newCount > halfLength) {
                return num;
            }
            map.put(num, newCount);
        }

        return -1;
    }

    /**
     * 题解3：
     *      思路：投票法
     *      时间复杂度：遍历数组时间复杂度是O(n)
     *      空间复杂度：使用常量大小的额外空间O(1)
     * @param nums
     * @return
     */
    public static int solution3(int[] nums) {
        // 候选人，初始为数组第一个数字
        int candidate = nums[0];
        // 初始票数为1
        int count = 1;

        // 从数组第二个数字开始遍历
        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];
            // 如果当前票数等于0，重新选举，把当前遍历到的数字设为选举人，票数设为1
            if (count == 0) {
                candidate = currentNum;
                count = 1;
            } else { // 如果当前票数不等于0，比较当前数字和候选人
                // 如果当前数字等于候选人，票数+1
                if (currentNum == candidate) {
                    count = count + 1;
                } else { // 否则票数-1
                    count = count - 1;
                }
            }
        }
        // 最后胜出的候选人就是目标数字
        return candidate;
    }

}
