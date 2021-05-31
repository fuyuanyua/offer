package com.example.offer.util;

/**
 * @Description: 创建数组的工具类
 * @Author: lhb
 * @Date: 2021/5/31 13:36
 */

public class ArrayUtil {

    /**
     * 创建一个包含重复数字的数组：[2, 3, 1, 0, 2, 5, 3]
     * @return
     */
    public static int[] createRepeatedArray() {
        int[] nums = new int[] {2, 3, 1, 0, 2, 5, 3};
        return nums;
    }

    /**
     * 创建一个没有重复数字的数组：[2, 3, 4, 5, 6, 7, 8]
     * @return
     */
    public static int[] createNoRepeatedArray() {
        int[] nums = new int[] {0, 1, 2, 3, 4, 5, 6};
        return nums;
    }

}
