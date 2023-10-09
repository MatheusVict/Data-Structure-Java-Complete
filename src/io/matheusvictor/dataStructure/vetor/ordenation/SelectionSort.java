package io.matheusvictor.dataStructure.vetor.ordenation;

/**
 * O(n²)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        for (int item : vector) {
            System.out.println(item);
        }

        int smallestPosition, auxiliary;
        for (int i = 0; i < vector.length; i++) {
            smallestPosition = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[smallestPosition]) {
                    smallestPosition = j;
                }
            }
            auxiliary = vector[smallestPosition];
            vector[smallestPosition] = vector[i];
            vector[i] = auxiliary;
        }

        System.out.println("After order");
        for (int item :
                vector) {
            System.out.println(item);
        }
    }
}
