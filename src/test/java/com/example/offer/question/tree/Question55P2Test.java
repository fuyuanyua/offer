package com.example.offer.question.tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Question55P1.TreeNode root1 = creatTree1();
        log.info("----------测试平衡二叉树----------");
        // 输入
        log.info("input = {}", root1);
        // 输出
        boolean result1 = Question55P2.solution1(root1);
        log.info("output = {}", result1);

        // 初始化一棵非平衡二叉树
        Question55P1.TreeNode root2 = creatTree2();
        log.info("----------测试非平衡二叉树----------");
        // 输入
        log.info("input = {}", root2);
        // 输出
        boolean result2 = Question55P2.solution1(root2);
        log.info("output = {}", result2);
    }

    /**
     * 创建一棵非平衡二叉树
     *          1
     *         / \
     *        1   1
     *       / \
     *      1   1
     *     /
     *    1
     * @return
     */
    private Question55P1.TreeNode creatTree2() {
        Question55P1.TreeNode root = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node1 = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node2 = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node3 = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node4 = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node5 = new Question55P1.TreeNode(1);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        node3.setLeft(node5);
        return root;
    }

    /**
     * 创建一棵平衡二叉树
     *          1
     *         / \
     *        1   1
     *       / \
     *      1   1
     * @return
     */
    private Question55P1.TreeNode creatTree1() {
        Question55P1.TreeNode root = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node1 = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node2 = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node3 = new Question55P1.TreeNode(1);
        Question55P1.TreeNode node4 = new Question55P1.TreeNode(1);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        return root;
    }
}