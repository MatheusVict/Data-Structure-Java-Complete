package io.matheusvictor.dataStructure.listaligada;

public class ListaLigada<T> {
    private Node<T> first;
    private Node<T> last;

    public void addNewElement(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null && last == null) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;

        this.size++;
    }

    public void addAtStart(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null && last == null) {
            this.first = newNode;
        } else {
            newNode.setNext(this.first);
            this.first = newNode;
        }
        this.last = newNode;

        this.size++;
    }

    public void removeNewElement(T element) {
        Node<T> previous = null;
        Node<T> current = this.first;
        if (this.size == 1) {
            this.first = null;
            this.last = null;
            this.size--;
            return;
        }
        for (int i = 0; i < this.getSize(); i++) {
            if (current.getElement().equals(element)) {
                if (current.equals(this.first)) {
                    this.first = current.getNext();
                } else if (current.equals(this.last)) {
                    this.last = previous;
                    previous.setNext(null);
                } else {
                    previous.setNext(current.getNext());
                }
                this.size--;
                return;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public Node<T> getElement(int position) {
        Node<T> current = this.first;
        for (int i = 0; i < position; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }

    public IteratorListaLigada<T> getIterator() {
        return new IteratorListaLigada<T>(this.first);
    }

    public ListaLigada() {
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size;

    @Override
    public String toString() {
        return "ListaLigada{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
