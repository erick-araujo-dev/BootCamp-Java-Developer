package one.digitalinnovation;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;

    }

    public void remove(int index){
        if(index >= this.tamanhoLista) throw new IndexOutOfBoundsException("O indice passado é maior que o tamanho da lista");
        No<T> noAulixiar =  this.cauda;
        if(index== 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAulixiar = noAulixiar.getNoProximo();

            }
            noAulixiar.setNoProximo(noAulixiar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(this.isEmpty()) throw new IndexOutOfBoundsException("A lista esta vazia");

        if (index == 0) return this.cauda;

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista <= 0;
     }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = " ";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += !(this.isEmpty()) ? "(Retorna para o ínicio)" : "[]";

        return strRetorno;
    }
}
