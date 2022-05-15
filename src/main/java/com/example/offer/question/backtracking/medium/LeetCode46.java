package com.example.offer.question.backtracking.medium;

import java.util.*;

/**
 * 全排列：https://leetcode.cn/problems/permutations/
 *
 * 回溯算法入门：https://leetcode.cn/problems/permutations/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liweiw/
 */

public class LeetCode46 {

    public static List<List<Integer>> solution1(int[] nums) {
        // 用于存放结果
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return list;
        }

        // 推荐用Deque来实例化一个栈
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[nums.length];
        int depth = 0;
        dfs(nums, depth, path, used, list);
        return list;
    }

    private static void dfs(int[] nums, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> list) {
        int length = nums.length;
        if (depth == length) {
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                path.addLast(nums[i]);
                used[i] = true;
                dfs(nums, depth + 1, path, used, list);
                // 回溯
                path.removeLast();
                used[i] = false;
            }
        }
    }
}
