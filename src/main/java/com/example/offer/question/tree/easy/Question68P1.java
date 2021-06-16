package com.example.offer.question.tree.easy;

import com.example.offer.datastructure.TreeNode;

/**
 * @Description: 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 * @Author: lhb
 * @Date: 2021/6/16 下午12:38
 *
 * 1.说明：给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 2.限制：
 *      所有节点的值都是唯一的。
 *      p、q 为不同节点且均存在于给定的二叉搜索树中。
 * 3.示例：
 *      输入：
 *              6
 *             / \
 *            2   8
 *           / \ / \
 *          0  4 7  9, p = 节点2, q = 节点8
 *      输出：
 *          6
 * 4.参考：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 * 5.笔记：
 *      1.祖先的定义：
 *          假设节点root为节点p的祖先，那么节点p在root的左子树或右子树中，或节点p本身就是root，
 *          也就是一个节点也可以是它自己的祖先。
 *          例如示例中的这棵树，节点0它的祖先有节点0、节点2、节点6
 *      2.二叉搜索树的特性：
 *          二叉搜索树的任意节点，其左子树节点都小于它，其右子树节点都大于它
 */

public class Question68P1 {

    /**
     * 解法1：
     *      思路：迭代，一层一层往下找
     *      根据二叉搜索树特性可以得出：
     *          已知节点root，节点p，
     *          若p.value > root.value，p在root的右子树中
     *          若p.value < root.value，p在root的左子树中
     *          若p.value = root.value，p就是root
     *      那么从root开始循环搜索：
     *          若p.value > root.value且q.value > root.value，则p、q都在root的右子树，root = root.right，继续循环
     *          若p.value < root.value且q.value < root.value，则p、q都在root的左子树，root = root.left，继续循环
     *          若其他情况，都表示root就是p、q的最近公共祖先，跳出循环
     *      时间复杂度：
     *          每轮循环都排除一层，设n为二叉搜索树的总节点数
     *          最优时间复杂度：当二叉搜索树为满二叉树时，O(logn)
     *          最差时间复杂度：当二叉搜索树退化成链表，O(n)
     *      空间复杂度：O(1)
     * @param root
     * @param p
     * @param q
     * @return
     */
    public static TreeNode solution1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        while (root != null) {
            if (p.value > root.value && q.value > root.value) {
                root = root.right;
            } else if (p.value < root.value && q.value < root.value) {
                root = root.left;
            } else {
                break;
            }
        }

        return root;
    }
}