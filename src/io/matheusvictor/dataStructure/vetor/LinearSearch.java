package io.matheusvictor.dataStructure.vetor;

import java.util.Scanner;

/**
 * O(n)
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] vector = new int[8];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }

        System.out.println("Choose a number");

        Scanner scanner = new Scanner(System.in);

        int terminal = scanner.nextInt();
        boolean found = false;

        for (int j : vector) {
            if (j == terminal) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("i found it");
        else System.out.println("nope");
    }
}