package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Teste1");
        minhaListaEncadeada.add("Teste2");
        minhaListaEncadeada.add("Teste3");
        minhaListaEncadeada.add("Teste4");

        System.out.println(minhaListaEncadeada.get(0));
    }

}