package io.matheusvictor.dataStructure.queue;

import io.matheusvictor.dataStructure.listaligada.ListaLigada;

public class Queue<T> {
    private final ListaLigada<T> listaLigada;

    public Queue() {
        this.listaLigada = new ListaLigada<>();
    }

    public void add(T element) {
        this.listaLigada.addNewElement(element);
    }

    public void remove() {
        this.listaLigada.removeNewElement(this.get());
    }

    public T get() {
        return this.listaLigada.getFirst().getElement();
    }
}
