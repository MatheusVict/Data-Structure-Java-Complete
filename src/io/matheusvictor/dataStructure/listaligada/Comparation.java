package io.matheusvictor.dataStructure.listaligada;

import java.util.ArrayList;

public class Comparation {
    public static void main(String[] args) {
        ListaLigada<Integer> listaLigada = new ListaLigada<>();

        ArrayList<Integer> vector = new ArrayList<>();

        long limit = 1000;
        long initialTime = System.currentTimeMillis();
        long finalTime;

        for (int i = 0; i < limit; i++) {
            vector.add(i);
        }

        finalTime = System.currentTimeMillis();
        System.out.println("JDK adding " + limit + " elements on memory: \n");
        System.out.println(finalTime - initialTime);

         initialTime = System.currentTimeMillis();

        for (int i = 0; i < limit; i++) {
            listaLigada.addNewElement(i);
        }

        finalTime = System.currentTimeMillis();
        System.out.println("my implementation adding " + limit + " elements on memory: \n");
        System.out.println(finalTime - initialTime);

        // ready from linkedList and read from vector

        initialTime = System.currentTimeMillis();

        for (int i = 0; i < vector.size(); i++) {
            vector.get(i);
        }

        finalTime = System.currentTimeMillis();
        System.out.println("JDK getting " + limit + " elements on memory:\n");
        System.out.println(finalTime - initialTime);

        initialTime = System.currentTimeMillis();

        IteratorListaLigada<Integer> iterator = listaLigada.getIterator();

        while (iterator.hasNext()) {
            iterator.getNext();
        }

        for (int i = 0; i < listaLigada.getSize(); i++) {
            listaLigada.getElement(i);
        }

        finalTime = System.currentTimeMillis();
        System.out.println("My implementation getting " + limit + " elements on memory:\n");
        System.out.println(finalTime - initialTime);
    }
}
