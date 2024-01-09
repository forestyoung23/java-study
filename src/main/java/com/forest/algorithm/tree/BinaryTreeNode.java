package com.forest.algorithm.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dongyang
 * @date 2021年03月07日 14:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BinaryTreeNode {
    /**
     * 节点值
     */
    private int value;

    /**
     * 左节点
     */
    private BinaryTreeNode left;

    /**
     * 右节点
     */
    private BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }
}
