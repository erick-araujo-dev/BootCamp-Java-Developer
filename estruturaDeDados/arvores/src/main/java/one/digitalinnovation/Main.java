package one.digitalinnovation;

import one.digitalinnovation.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>(){{
            inserir(new Obj(13));
            inserir(new Obj(10));
            inserir(new Obj(25));
            inserir(new Obj(2));
            inserir(new Obj(12));
            inserir(new Obj(20));
            inserir(new Obj(31));
            inserir(new Obj(29));
        }};

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirPreOrdem();

        minhaArvore.remove( new Obj(20));
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirInOrdem();
    }
}