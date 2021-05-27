package com.example.offer.datastructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description: 定义一个二叉树节点
 * @Author: lhb
 * @Date: 2021/5/26 20:39
 */

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {

    /**
     * 节点值
     */
    public int value;

    /**
     * 左子树
     */
    public TreeNode left;

    /**
     * 右子树
     */
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}
