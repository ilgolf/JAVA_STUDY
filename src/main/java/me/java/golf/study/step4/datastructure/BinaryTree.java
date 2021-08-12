package me.java.golf.study.step4.datastructure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public void dfs(Node node) {
        if(node == null) {
            return;
        }

        dfs(node.getLeft());
        System.out.println(node.getElement());
        dfs(node.getRight());
    }

    public void bfs(Node node) {
        if(node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()) {
            traverse(queue);
        }
    }

    private void traverse(Queue<Node> queue) {
        Node curr = queue.poll();
        if(curr != null) {
            System.out.println(curr.getElement() + " ");
            getChild(queue, curr.getLeft());
            getChild(queue, curr.getRight());
        }
    }

    private void getChild(Queue<Node> queue, Node child) {
        if(child != null) {
            queue.add(child);
        }
    }
}
