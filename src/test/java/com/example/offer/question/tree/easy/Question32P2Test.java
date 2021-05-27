package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Description: Question32P2Test
 * @Author: lhb
 * @Date: 2021/5/27 16:40
 */

@Slf4j
class Question32P2Test {

    @Test
    void solution1() {
        // 初始化一棵二叉树
        TreeNode root1 = TreeUtil.createTree();
        log.info("----------测试二叉树----------");
        // 输入
        log.info("input = {}", root1);
        // 输出
        List<List<Integer>> result1 = Question32P2.solution1(root1);
        log.info("output = {}", result1);

        // 初始化一棵空二叉树
        TreeNode root2 = TreeUtil.createEmptyTree();
        log.info("----------测试空二叉树----------");
        // 输入
        log.info("input = {}", root2);
        // 输出
        List<List<Integer>> result2 = Question32P2.solution1(root2);
        log.info("output = {}", result2);
    }
}