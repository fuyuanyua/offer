package com.example.offer.milestone.tree.example;

import com.example.offer.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: lihaibin
 * @Date: 2022/5/27 22:07
 * @Description: 层序遍历示例（迭代实现）
 */

public class BfsExample {

    public static List<Integer> levelTraverse(TreeNode root) {
        // 用于保存结果
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // 需要借助一个先进先出的队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // 这一层的节点数
            int size = queue.size();
            // 从左到右遍历这一层的所有节点
            for (int i = 0; i < size; i++) {
                // 遍历到一个节点，就把节点加入结果集
                TreeNode node = queue.poll();
                result.add(node.value);
                // 把下一层的节点放入队列
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return result;
    }
}
