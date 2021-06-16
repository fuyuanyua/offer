package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;
import com.example.offer.util.TreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question68P1Test
 * @Author: lhb
 * @Date: 2021/6/16 下午1:53
 */

@Slf4j
class Question68P1Test {

    @Test
    void solution1() {
        // 创建一棵二叉搜索树
        TreeNode root = TreeUtil.createBinarySearchTree();
        // 随机获取树的一个子节点p
        TreeNode p = TreeUtil.getRandomChildNode(root);
        // 随机获取树的一个子节点q
        TreeNode q = TreeUtil.getRandomChildNode(root);
        // 保证p、q不是同一个节点
        while (p.value == q.value) {
            p = TreeUtil.getRandomChildNode(root);
            q = TreeUtil.getRandomChildNode(root);
        }
        log.info("input = {}, {}, {}", root, p.value, q.value);
        TreeNode result = Question68P1.solution1(root, p, q);
        log.info("result = {}", result.value);
    }
}