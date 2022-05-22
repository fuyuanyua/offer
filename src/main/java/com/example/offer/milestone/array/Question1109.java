package com.example.offer.milestone.array;

import com.example.offer.util.DifferenceUtil;

/**
 * @Author: lihaibin
 * @Date: 2022/5/22 16:24
 * @Description: 航班预订统计：https://leetcode.cn/problems/corporate-flight-bookings/
 *
 * 笔记：
 *      类型：【差分数组】
 *      对此题目进行抽象，就可以使用差分数组的技巧
 *
 *      输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 *      输出：[10,55,45,25,25]
 *      解释：
 *          航班编号        1   2   3   4   5
 *          预订记录 1 ：   10  10
 *          预订记录 2 ：       20  20
 *          预订记录 3 ：       25  25  25  25
 *          总座位数：      10  55  45  25  25
 *      因此，answer = [10,55,45,25,25]
 *
 *      来源：力扣（LeetCode）
 *      链接：https://leetcode.cn/problems/corporate-flight-bookings
 *      著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Question1109 {

    /**
     * 返回每个航班预定的总票数
     * @param bookings 预定记录详情
     * @param n 总航班数
     * @return
     */
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        if (n <= 0 || bookings.length == 0) {
            return new int[0];
        }

        // 初始化每个航班的总票数，初始都是0
        int[] nums = new int[n];
        DifferenceUtil differenceUtil = new DifferenceUtil(nums);
        // 注意航班是从1开始，而非从0开始，所以第1个航班在数组中的索引是0
        for (int[] booking : bookings) {
            int firstFlight = booking[0] - 1;
            int lastFlight = booking[1] - 1;
            int count = booking[2];
            differenceUtil.increment(firstFlight, lastFlight, count);
        }

        return differenceUtil.getResult();
    }
}
