package com.example.offer.sort;


import com.example.offer.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import sun.rmi.runtime.Log;

import java.util.Random;

/**
 * @Description: 猴子排序算法
 * @Author: lhb
 * @Date: 2021/6/10 20:38
 *
 * 1.思想：重复地随机打乱数组，直到数组有序，是十分低效的排序算法，实际生产中根本不会有人用这个算法
 * 2.参考：https://zh.wikipedia.org/zh-tw/Bogo%E6%8E%92%E5%BA%8F
 */

public class BogoSort {

    /**
     * 猴子排序
     * @param nums
     * @return 打乱数组的总次数
     */
    public static long bogoSort(int[] nums) {
        long count = 0L;
        while (!ArrayUtils.isSorted(nums)) {
            count++;
            shuffle(nums);
        }
        return count;
    }

    /**
     * 随机打乱数组
     * @param nums
     * @return
     */
    private static void shuffle(int[] nums) {
        Random random = new Random();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            int randomIndex = random.nextInt(nums.length - i) + i;
            temp = nums[randomIndex];
            nums[randomIndex] = nums[i];
            nums[i] = temp;
        }
    }
}
