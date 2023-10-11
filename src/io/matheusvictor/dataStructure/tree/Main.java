package io.matheusvictor.dataStructure.tree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        tree.add(10);
        tree.add(8);
        tree.add(9);
        tree.add(5);
        tree.add(7);
        tree.add(18);
        tree.add(13);
        tree.add(13);
        tree.add(20);

        System.out.println("Ordering");
        tree.ordered(tree.getRoot());

        System.out.println("Pre-order");
        tree.preOrder(tree.getRoot());

        System.out.println("After Order");
        tree.afterOrder(tree.getRoot());
    }
}
