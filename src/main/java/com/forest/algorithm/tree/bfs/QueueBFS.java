package com.forest.algorithm.tree.bfs;

import com.forest.algorithm.tree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层序遍历（又称广度优先遍历、广度优先搜索）BFS
 * 广度优先遍历通常借助“队列”来实现。队列遵循“先进先出”的规则，而广度优先遍历则遵循“逐层推进”的规则，两者背后的思想是一致的。
 *
 * @author Forest Dong
 * @date 2024年01月09日 19:27
 */
public class QueueBFS {
    public static List<Integer> bfs(BinaryTreeNode tree) {
        // 初始化 list 用于存放遍历结果
        List<Integer> result = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            result.add(node.getValue());
            if (null != node.getLeft()) {
                queue.offer(node.getLeft());
            }
            if (null != node.getRight()) {
                queue.offer(node.getRight());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        List<Integer> bfs = bfs(node1);
        System.err.println(bfs);
    }
}
