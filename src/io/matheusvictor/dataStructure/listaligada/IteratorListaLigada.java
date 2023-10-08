package io.matheusvictor.dataStructure.listaligada;

public class IteratorListaLigada<T> {
    private Node<T> element;

    public boolean hasNext() {
        return element.getNext() != null;
    }

    public Node<T> getNext() {
        this.element = this.element.getNext();
        return element.getNext();
    }

    public IteratorListaLigada(Node<T> element) {
        this.element = element;
    }
}
