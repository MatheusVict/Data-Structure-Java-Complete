package io.matheusvictor.dataStructure.listaligada;

public class Main {
    public static void main(String[] args) {
        ListaLigada<String> listaLigada = new ListaLigada<>();
        listaLigada.addNewElement("1 node");
        listaLigada.addNewElement("2 node");
        listaLigada.addNewElement("3 node");
        listaLigada.addNewElement("4 node");
        listaLigada.addNewElement("5 node");
        System.out.println(listaLigada.getSize());
        System.out.println("isso aí " + listaLigada);
        System.out.println("isso aí " + listaLigada.getLast().getElement());
        System.out.println("elemento get " + listaLigada.getElement(2));

        System.out.println("---------------------");
        System.out.println("before romve first");
        System.out.println("---------------------");
        listaLigada.removeNewElement("1 node");
        System.out.println(listaLigada);

        System.out.println("---------------------");
        System.out.println("before romve last");
        System.out.println("---------------------");
        listaLigada.removeNewElement("5 node");
        System.out.println(listaLigada);


        ListaLigada<Contact> contactListaLigada = new ListaLigada<>();

        contactListaLigada.addNewElement(new Contact("oi", 123));
        contactListaLigada.addNewElement(new Contact("oi1", 123));
        contactListaLigada.addNewElement(new Contact("oi2", 123));

        System.out.println(contactListaLigada);
    }
}
