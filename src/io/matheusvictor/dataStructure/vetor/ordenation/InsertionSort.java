package io.matheusvictor.dataStructure.vetor.ordenation;

/**
 * O(n²)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        System.out.println("Before order\n");
        for (int ve :
                vector) {
            System.out.println(ve);
        }

        int auxiliary;
        int j;
        for (int i = 1; i < vector.length; i++) {
            auxiliary = vector[i];
            j = i - 1;
            while (j >= 0 && vector[j] > auxiliary) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = auxiliary;
        }

        System.out.println("after order");
        for (int item :
                vector) {
            System.out.println(item);
        }
    }
}
