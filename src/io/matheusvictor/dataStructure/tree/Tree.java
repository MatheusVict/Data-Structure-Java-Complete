package io.matheusvictor.dataStructure.tree;


public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(T element) {
        Node<T> node = new Node<>(element);

        if (this.root == null) {
            this.root = node;
        } else {
            Node<T> current = this.root;
            while (true) {
                if (node.getElement().compareTo(current.getElement()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(node);
                        break;
                    }
                } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(node);
                        break;
                    }
                }
            }
        }
    }

    public void ordered(Node<T> current) {
        if (current != null) {
            ordered(current.getLeft());
            System.out.println(current.getElement());
            ordered(current.getRight());
        }
    }

    public void preOrder(Node<T> current) {
        if (current != null) {
            System.out.println(current.getElement());
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void afterOrder(Node<T> current) {
        if (current != null) {
            afterOrder(current.getLeft());
            afterOrder(current.getRight());
            System.out.println(current.getElement());
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
