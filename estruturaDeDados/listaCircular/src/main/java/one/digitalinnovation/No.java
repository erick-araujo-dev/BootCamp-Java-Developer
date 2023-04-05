package one.digitalinnovation;

public class No <T>{
    private  T conteudo;
    private No<T> noProximo;

    public No(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    ;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> proximoNo) {
        this.noProximo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
