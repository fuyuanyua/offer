package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.question.tree.medium.Question32P3;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Description: Question54Test
 * @Author: lhb
 * @Date: 2021/5/28 11:11
 */

@Slf4j
class Question54Test {

    @Test
    void solution1() {
        // 初始化一棵二叉搜索树
        TreeNode root1 = TreeUtil.createBinarySearchTree();
        int k1 = 3;
        log.info("----------测试二叉搜索树----------");
        // 输入
        log.info("input = {}, {}", root1, k1);
        // 输出
        int result1 = Question54.solution1(root1, k1);
        log.info("output = {}", result1);

        // 初始化一棵空二叉搜索树
        TreeNode root2 = TreeUtil.createEmptyTree();
        int k2 = 3;
        log.info("----------测试空二叉搜索树----------");
        // 输入
        log.info("input = {}, {}", root2, k2);
        // 输出
        int result2 = Question54.solution1(root2, k2);
        log.info("output = {}", result2);
    }
}