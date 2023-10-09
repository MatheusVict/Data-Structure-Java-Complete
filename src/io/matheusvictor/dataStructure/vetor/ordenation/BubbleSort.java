package io.matheusvictor.dataStructure.vetor.ordenation;
/*
*
* O(n²)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }

        int auxiliary;
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    auxiliary = vector[j];
                    vector[j] = vector[i];
                    vector[i] = auxiliary;
                }
            }
        }

        System.out.println("after bubble");
        for(int i: vector) {
            System.out.println(i);
        }
    }
}
