package com.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaDuplaEncadeada<String> minhaListaEncadeada = new ListaDuplaEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3,"100");

        System.out.println();
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.size());

    }
}