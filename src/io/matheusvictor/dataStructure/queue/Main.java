package io.matheusvictor.dataStructure.queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fila = new Queue<>();

        fila.add("matheus");
        fila.add("victor");
        fila.add("henrique");
        fila.add("da");
        fila.add("silva");

        System.out.println(fila.get());
        fila.remove();
        System.out.println(fila.get());
    }
}
