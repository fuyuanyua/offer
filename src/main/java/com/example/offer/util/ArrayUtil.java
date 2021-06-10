package com.example.offer.util;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    /**
     * 创建一个正序排序数组：[5,7,7,8,8,10]
     * @return
     */
    public static int[] createSortedArray() {
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        return nums;
    }

    /**
     * 随机创建符合Question53P2的数组：
     *      一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内，
     *      在范围0～n-1内的n个数字中有且只有一个数字不在该数组中
     *      例如：[0, 1, 2, 4, 5]
     *      此方法生成的随机数组，长度在[1, 21)范围内
     * @return
     */
    public static int[] createQuestion53P2Array() {
        List<Integer> list = new ArrayList<>();

        Integer temp = new Random().nextInt(20);
        // n的范围为[2, 22)
        int n = temp + 2;

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        list.remove(new Random().nextInt(n));

        // List<Integer> -> int[]
        // 方法1：stream
        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();

        // 方法2：借助commons-lang3包下的ArrayUtils.toPrimitive方法
        // int[] nums = ArrayUtils.toPrimitive(list.toArray(new Integer[list.size()]));
        return nums;
    }

    /**
     * 创建符合Question39的数组：[1, 2, 3, 2, 2, 2, 5, 4, 2]
     * @return
     */
    public static int[] createQuestion39Array() {
        int[] nums = new int[] {1, 2, 3, 2, 2, 2, 5, 4, 2};
        return nums;
    }

    /**
     * 创建符合Question40的数组：[3, 2, 1]
     * @return
     */
    public static int[] createQuestion40Array() {
        int[] nums = new int[] {3, 2, 1};
        return nums;
    }

}
