package io.matheusvictor.dataStructure.vetor;

public class Recursive {
    public static void main(String[] args) {
        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        for (int item : vector) {
            System.out.println(item);
        }

        System.out.println("Summing");
        System.out.println(sum(0, 0, vector));

    }

    private static int sum(int soma, int position, int[] vector) {
        if (position < vector.length) {
            soma += vector[position];
            return sum(soma, position + 1, vector);
        }
        return soma;
    }
}
