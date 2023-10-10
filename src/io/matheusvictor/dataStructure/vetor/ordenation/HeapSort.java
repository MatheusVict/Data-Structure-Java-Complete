package io.matheusvictor.dataStructure.vetor.ordenation;

public class HeapSort {
    public static void main(String[] args) {
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        System.out.println("Disorder");
        for (int item :
                vector) {
            System.out.print(item + " ");
        }


        int vectorLength = vector.length;

        for (int i = vectorLength / 2 - 1; i >= 0; i--) {
            applyHeap(vector, vectorLength, i);
        }

        System.out.println("\nAlmost ordered");
        for (int item :
                vector) {
            System.out.print(item + " ");
        }

        for (int i = vectorLength - 1; i > 0; i--) {
            int auxiliary = vector[0];
            vector[0] = vector[i];
            vector[i] = auxiliary;

            applyHeap(vector, i, 0);
        }


        System.out.println("\nOrdered");
        for (int item :
                vector) {
            System.out.print(item + " ");
        }
    }

    private static void applyHeap(int[] vector, int vectorLength, int position) {
        int root = position;
        int left = 2 * position + 1;
        int right = 2 * position + 2;

        if (left < vectorLength && vector[left] > vector[root]) {
            root = left;
        }
        if (right < vectorLength && vector[right] > vector[root]) {
            root = right;
        }

        if (root != position) {
            int auxiliary = vector[position];
            vector[position] = vector[root];
            vector[root] = auxiliary;

            applyHeap(vector, vectorLength, root);
        }
    }
}
