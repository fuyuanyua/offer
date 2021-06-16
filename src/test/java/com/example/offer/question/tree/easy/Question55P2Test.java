package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.question.tree.easy.Question55P1;
import com.example.offer.question.tree.easy.Question55P2;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question55P2Test
 * @Author: lhb
 * @Date: 2021/5/25 15:22
 */

@Slf4j
class Question55P2Test {

    @Test
    void solution1() {
        // 初始化一棵平衡二叉树
        TreeNode root1 = TreeUtil.creatBalancedBinaryTree();
        log.info("----------测试平衡二叉树----------");
        // 输入
        log.info("input = {}", root1);
        // 输出
        boolean result1 = Question55P2.solution1(root1);
        log.info("output = {}", result1);

        // 初始化一棵非平衡二叉树
        TreeNode root2 = TreeUtil.creatUnbalancedBinaryTree();
        log.info("----------测试非平衡二叉树----------");
        // 输入
        log.info("input = {}", root2);
        // 输出
        boolean result2 = Question55P2.solution1(root2);
        log.info("output = {}", result2);
    }
}