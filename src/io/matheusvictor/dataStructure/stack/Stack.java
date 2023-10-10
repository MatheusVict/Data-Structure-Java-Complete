package io.matheusvictor.dataStructure.stack;

import io.matheusvictor.dataStructure.listaligada.ListaLigada;

public class Stack<T> {
    private ListaLigada<T> listaLigada;

    public Stack() {
        this.listaLigada = new ListaLigada<>();
    }

    public void add(T element) {
        this.listaLigada.addAtStart(element);
    }

    public void remove() {
        this.listaLigada.removeNewElement(this.get());
    }

    public T get() {
        return this.listaLigada.getFirst().getElement();
    }
}
