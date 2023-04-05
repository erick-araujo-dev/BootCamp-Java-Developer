package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> myListCirc = new ListaCircular<>();

        myListCirc.add("c0");

        System.out.println(myListCirc);

        myListCirc.remove(0  );
        System.out.println(myListCirc);

        myListCirc.add("c1");
        System.out.println(myListCirc);

        myListCirc.add("c2");
        myListCirc.add("c3");
        System.out.println(myListCirc);

        System.out.println(myListCirc.get(55));

        for (int i = 0; i < 20; i++) {
            System.out.println(myListCirc.get(i));

        }

    }
}