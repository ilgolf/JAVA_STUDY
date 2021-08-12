package me.java.golf.study.step4.datastructure;

public class Node {

    private int element;
    private Node left;
    private Node right;

    public Node(int element) {
        this.element = element;
        left = right = null;
    }

    public Node(int element, Node left, Node right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public int getElement() {
        return element;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
