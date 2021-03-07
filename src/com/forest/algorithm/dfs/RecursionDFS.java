package com.forest.algorithm.dfs;

import com.forest.algorithm.common.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * 以二叉树为例使用递归实现DFS算法
 *
 * @author Forest
 * @date 2021年03月07日 14:35
 */
public class RecursionDFS {
    private List<Integer> list = new ArrayList<>();

    public void dfs(BinaryTreeNode node) {
        if (null == node) {
            return;
        }
        // 逻辑处理
        process(node);
        // 遍历左节点
        dfs(node.getLeft());
        // 遍历右节点
        dfs(node.getRight());
    }

    /**
     * 逻辑处理
     * 这里将节点值添加进List中，用来展示搜索顺序，在实际应用中可修改为相应的业务处理逻辑
     *
     * @param currentNode
     * @return
     * @author dongyang
     * @date 2021/3/7 下午3:23
     */
    private void process(BinaryTreeNode currentNode) {
        // 这里将节点值添加进List中，用来展示搜索顺序，在实际应用中可修改为相应的业务处理逻辑
        list.add(currentNode.getValue());
    }

    /**
     * 以下面二叉树为例
     *      1
     *     / \
     *    3   2
     *   / \
     *  5   6
     *
     * @param
     * @return
     * @author dongyang
     * @date 2021/3/7 下午3:26
     */
    public static void main(String[] args) {
        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.setValue(5);
        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.setValue(6);
        BinaryTreeNode node3 = new BinaryTreeNode(3, node5, node6);
        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.setValue(2);
        BinaryTreeNode node1= new BinaryTreeNode(1, node3, node2);
        RecursionDFS dfs = new RecursionDFS();
        dfs.dfs(node1);
        System.out.println(dfs.list);
    }
}
