package me.java.golf.study.step4.datastructure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

    private final Node rightChildToRight = new Node(6, new Node(8), new Node(9));
    private final Node rightChild = new Node(3, rightChildToRight, new Node(7));
    private final Node leftChild = new Node(2, new Node(4), new Node(5));
    private final Node root = new Node(1, leftChild, rightChild);

    @Test
    @DisplayName("Deep first search")
    void dfs() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.dfs(root);
    }

    @Test
    @DisplayName("Breadth first search")
    void bfs() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.bfs(root);
    }
}