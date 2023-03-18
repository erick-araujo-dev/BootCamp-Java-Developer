package one.digitalinnovation;

public class ListaEncadeada<T> {
    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);

        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAux = noAux.getProximoNo();
        }

        noAux.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndex(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }

        return noRetorno;

    }

    public T remove(int index){
        validaIndex(index);
        No<T> noPivor = getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());

        return noPivor.getConteudo();

    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAux = referenciaEntrada;
        while (true){
            if (refAux != null){
                tamanhoLista++;
                if (refAux.getProximoNo() != null){
                    refAux = refAux.getProximoNo();
                }else{
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndex(int index){
        if(index >= size()){
            int lastIndex = size() - 1;
            throw  new IndexOutOfBoundsException("Não existe indice "+index+ "na lista. A lista só tem até o indice " + lastIndex + ".");
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = referenciaEntrada;

        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAux.getConteudo() + "} -->";
            noAux = noAux.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
