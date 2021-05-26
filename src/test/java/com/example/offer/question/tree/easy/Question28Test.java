package com.example.offer.question.tree.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question28Test
 * @Author: lhb
 * @Date: 2021/5/26 16:52
 */

@Slf4j
class Question28Test {

    @Test
    void solution1() {
        // 初始化一棵对称二叉树
        Question28.TreeNode root1 = createTree1();
        log.info("----------测试对称二叉树----------");
        // 输入
        log.info("input = {}", root1);
        // 输出
        boolean result1 = Question28.solution1(root1);
        log.info("output = {}", result1);

        // 初始化一棵非对称二叉树
        Question28.TreeNode root2 = createTree2();
        log.info("----------测试非对称二叉树----------");
        // 输入
        log.info("input = {}", root2);
        // 输出
        boolean result2 = Question28.solution1(root2);
        log.info("output = {}", result2);
    }

    /**
     * 创建一棵非对称二叉树
     *          8
     *         / \
     *        6   6
     *       / \ / \
     *      5  7 7  5
     *               \
     *                9
     * @return
     */
    private Question28.TreeNode createTree2() {
        Question28.TreeNode root = new Question28.TreeNode(8);
        Question28.TreeNode node1 = new Question28.TreeNode(6);
        Question28.TreeNode node2 = new Question28.TreeNode(6);
        Question28.TreeNode node3 = new Question28.TreeNode(5);
        Question28.TreeNode node4 = new Question28.TreeNode(7);
        Question28.TreeNode node5 = new Question28.TreeNode(7);
        Question28.TreeNode node6 = new Question28.TreeNode(5);
        Question28.TreeNode node7 = new Question28.TreeNode(9);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node2.setLeft(node5).setRight(node6);
        node6.setRight(node7);
        return root;
    }

    /**
     * 创建一棵对称二叉树
     *          8
     *         / \
     *        6   6
     *       / \ / \
     *      5  7 7  5
     * @return
     */
    private Question28.TreeNode createTree1() {
        Question28.TreeNode root = new Question28.TreeNode(8);
        Question28.TreeNode node1 = new Question28.TreeNode(6);
        Question28.TreeNode node2 = new Question28.TreeNode(6);
        Question28.TreeNode node3 = new Question28.TreeNode(5);
        Question28.TreeNode node4 = new Question28.TreeNode(7);
        Question28.TreeNode node5 = new Question28.TreeNode(7);
        Question28.TreeNode node6 = new Question28.TreeNode(5);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node2.setLeft(node5).setRight(node6);
        return root;
    }
}