package io.matheusvictor.dataStructure.vetor.ordenation;

public class QuickSort {
    public static void main(String[] args) {
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        System.out.println("Disordered");
        for (int item : vector) {
            System.out.print(item + " ");
        }

        quickSort(vector, 0, vector.length - 1);

        System.out.println("\nOrdered");
        for (int item : vector) {
            System.out.print(item + " ");
        }
    }

    private static void quickSort(int[] vector, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivot = partition(vector, leftIndex, rightIndex);
            quickSort(vector, leftIndex, pivot);
            quickSort(vector, pivot + 1, rightIndex);
        }
    }

    private static int partition(int[] vector, int leftIndex, int rightIndex) {
        int middle = (leftIndex + rightIndex) / 2;
        int pivot = vector[middle];
        int i = leftIndex - 1;
        int j = rightIndex + 1;

        while (true) {
            do {
                i++;
            } while (vector[i] < pivot);

            do {
                j--;
            } while (vector[j] > pivot);

            if (i >= j) {
                return j;
            }

            int auxiliary = vector[i];
            vector[i] = vector[j];
            vector[j] = auxiliary;
        }
    }
}
