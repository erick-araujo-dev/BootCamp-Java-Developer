package one.digitalinnovation;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public void enqueue(T object){
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAux = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAux.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAux = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto="+ noAux.getObject() +"}] -->";
                if (noAux.getRefNo() != null){
                    noAux = noAux.getRefNo();
                } else {
                    stringRetorno +=" null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
