package com.example.offer.question.tree.easy;

import com.example.offer.question.tree.easy.Question27;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: Question27Test
 * @Author: lhb
 * @Date: 2021/5/26 13:23
 */

@Slf4j
class Question27Test {

    @Test
    void solution1() {
        // 初始化一棵二叉树
        Question27.TreeNode root = createTree();
        log.info("----------测试二叉树的镜像----------");
        // 输入
        log.info("input = {}", root);
        // 输出
        Question27.TreeNode result = Question27.solution1(root);
        log.info("output = {}", result);
    }

    /**
     * 创建一棵二叉树
     *          4
     *         / \
     *        2   7
     *       / \
     *      1   3
     * @return
     */
    private Question27.TreeNode createTree() {
        Question27.TreeNode root = new Question27.TreeNode(4);
        Question27.TreeNode node1 = new Question27.TreeNode(2);
        Question27.TreeNode node2 = new Question27.TreeNode(7);
        Question27.TreeNode node3 = new Question27.TreeNode(1);
        Question27.TreeNode node4 = new Question27.TreeNode(3);
        root.setLeft(node1).setRight(node2);
        node1.setLeft(node3).setRight(node4);
        return root;
    }
}