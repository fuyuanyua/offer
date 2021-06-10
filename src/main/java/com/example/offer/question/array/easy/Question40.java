package com.example.offer.question.array.easy;

import java.util.PriorityQueue;

/**
 * @Description: 剑指 Offer 40. 最小的k个数
 * @Author: lhb
 * @Date: 2021/6/9 16:12
 *
 * 1.说明：输入整数数组arr，找出其中最小的k个数（经典的topk问题）。
 * 2.限制：
 *      0 <= k <= arr.length <= 10000
 *      0 <= arr[i] <= 10000
 * 3.示例：
 *      输入：
 *          [3,2,1], 2
 *      输出：
 *          [1,2]或[2,1]
 * 4.参考：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 * 5.笔记：
 *      topk问题，很容易想到借助大顶堆或小顶堆来实现：
 *          1.最小的k个：大顶堆，new PriorityQueue<>((v1, v2) -> (v2 - v1))，传入比较器，构造一个大顶堆
 *          2.最大的k个：小顶堆，new PriorityQueue<>()，无参构造方法默认小顶堆
 */

public class Question40 {

    /**
     * 解法1：
     *      思路：
     *          1.借助一个容量为k的容器，用于存储最小的k个数字
     *          2.遍历数组，每访问一个元素：
     *              1.若容器未满，直接把元素放入容器
     *              2.若容器已满，找出容器的最大数，比较此元素与最大数：
     *                  1.如果此元素比最大数小，删除最大数，然后把此元素插入容器
     *                  2.否则什么都不做，然后继续访问下一个元素
     *          3.遍历完数组，最后返回这个容器中的所有元素
     *      容器：
     *          1.借助PriorityQueue（优先队列（堆）），默认是一个小顶堆，我们需要构造为大顶堆
     *          2.获取最大值：peek方法：直接返回队列头（不删除），时间复杂度O(1)
     *          3.删除：poll方法：删除队列头，并重新维护这个堆，时间复杂度O(logn)
     *          4.插入：offer方法：把元素插入队列，并重新维护这个堆，时间复杂度O(logn)
     *      时间复杂度：遍历数组O(n)，每次对容器的操作O(logk)，所以总时间复杂度O(nlogk)
     *      空间复杂度：额外借助了一个k大小的容器，所以是O(k)
     * @param arr
     * @param k
     * @return
     */
    public static int[] solution1(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }

        // 逻辑数据结构是大顶堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (v1, v2) -> (v2 - v1));
        for (int item : arr) {
            if (maxHeap.size() < k) {
                maxHeap.offer(item);
            } else {
                // 因为是大顶堆，队首永远是最大值
                Integer max = maxHeap.peek();
                if (item < max) {
                    // 移除队首元素，也就是最大值
                    maxHeap.poll();
                    // 插入新值
                    maxHeap.offer(item);
                }
            }
        }

        // 遍历大顶堆返回结果
        int[] result = new int[maxHeap.size()];
        int size = maxHeap.size();
        for (int i = 0; i < size; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
}
