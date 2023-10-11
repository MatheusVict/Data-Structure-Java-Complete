package io.matheusvictor.dataStructure.tree;

public class Node<T> {
    private T element;

    private Node<T> left;

    private Node<T> right;

    public Node(T element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
