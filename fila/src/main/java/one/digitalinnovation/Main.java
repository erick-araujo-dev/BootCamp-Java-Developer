package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");



        //imprimindo a fila
        System.out.println(minhaFila);
        //retirando o primeiro da fila
        System.out.println(minhaFila.dequeue());
        //imprimindo o novo primeiro da fila, já que o primeiro foi retirado anteriormente com o dequeue
        System.out.println(minhaFila.first());
        //imprimindo novamente a fila
        System.out.println(minhaFila);
    }
}