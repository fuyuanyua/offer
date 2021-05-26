package com.example.offer.question.tree.easy;

import com.example.offer.question.tree.easy.Question55P1;
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
        // 初始化一棵二叉树
        //       5
        //      / \
        //     8   4
        //    / \
        //   6   10
        //  /
        // 2
        Question55P1.TreeNode root = new Question55P1.TreeNode(5);
        Question55P1.TreeNode node1 = new Question55P1.TreeNode(8);
        Question55P1.TreeNode node2 = new Question55P1.TreeNode(4);
        Question55P1.TreeNode node3 = new Question55P1.TreeNode(6);
        Question55P1.TreeNode node4 = new Question55P1.TreeNode(10);
        Question55P1.TreeNode node5 = new Question55P1.TreeNode(2);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node3.setLeft(node5);

        // 输入
        log.info("input = {}", root);

        // 输出
        int result = Question55P1.solution1(root);
        log.info("output = {}", result);
    }

    @Test
    void solution2() {
        // 初始化一棵二叉树
        //       5
        //      / \
        //     8   4
        //    / \
        //   6   10
        //  /
        // 2
        Question55P1.TreeNode root = new Question55P1.TreeNode(5);
        Question55P1.TreeNode node1 = new Question55P1.TreeNode(8);
        Question55P1.TreeNode node2 = new Question55P1.TreeNode(4);
        Question55P1.TreeNode node3 = new Question55P1.TreeNode(6);
        Question55P1.TreeNode node4 = new Question55P1.TreeNode(10);
        Question55P1.TreeNode node5 = new Question55P1.TreeNode(2);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node3.setLeft(node5);

        // 输入
        log.info("input = {}", root);

        // 输出
        int result = Question55P1.solution2(root);
        log.info("output = {}", result);
    }

    @Test
    void solution3() {
        // 初始化一棵二叉树
        //       5
        //      / \
        //     8   4
        //    / \
        //   6   10
        //  /
        // 2
        Question55P1.TreeNode root = new Question55P1.TreeNode(5);
        Question55P1.TreeNode node1 = new Question55P1.TreeNode(8);
        Question55P1.TreeNode node2 = new Question55P1.TreeNode(4);
        Question55P1.TreeNode node3 = new Question55P1.TreeNode(6);
        Question55P1.TreeNode node4 = new Question55P1.TreeNode(10);
        Question55P1.TreeNode node5 = new Question55P1.TreeNode(2);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node3.setLeft(node5);

        // 输入
        log.info("input = {}", root);

        // 输出
        int result = Question55P1.solution3(root);
        log.info("output = {}", result);
    }
}