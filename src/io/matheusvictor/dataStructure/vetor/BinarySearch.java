package io.matheusvictor.dataStructure.vetor;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] vector = new int[1000000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i * 5;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("choose a number");
        int numberChoose = scanner.nextInt();

        int count = 0;
        boolean found = false;
        int start = 0;
        int end = vector.length - 1;
        int middle;

        while (start <= end) {
            count++;
            middle = (start + end) / 2;

            if (vector[middle] == numberChoose) {
                found = true;
                break;
            } else if (vector[middle] < numberChoose) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println("How many tests: " + count);
        if (found) System.out.println("I found it");
        else System.out.println("I didn't");
    }
}
