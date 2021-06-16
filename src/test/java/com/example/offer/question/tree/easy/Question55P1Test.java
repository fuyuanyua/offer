package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.question.tree.easy.Question55P1;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question55P1Test
 * @Author: lhb
 * @Date: 2021/5/24 13:34
 */

@Slf4j
class Question55P1Test {

    @Test
    void solution1() {
        TreeNode root = TreeUtil.createTree();

        // 输入
        log.info("input = {}", root);

        // 输出
        int result = Question55P1.solution1(root);
        log.info("output = {}", result);
    }

    @Test
    void solution2() {
        TreeNode root = TreeUtil.createTree();

        // 输入
        log.info("input = {}", root);

        // 输出
        int result = Question55P1.solution2(root);
        log.info("output = {}", result);
    }

    @Test
    void solution3() {
        TreeNode root = TreeUtil.createTree();

        // 输入
        log.info("input = {}", root);

        // 输出
        int result = Question55P1.solution3(root);
        log.info("output = {}", result);
    }
}