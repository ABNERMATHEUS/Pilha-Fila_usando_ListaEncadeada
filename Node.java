package Lista_Fila_Pilha;

public class Node {


    private int informacao;
    private Node proximo;

    public Node() {
        this.proximo = null;
    }

    public int getInformacao() {
        return informacao;
    }

    public void setInformacao(int informação) {
        this.informacao = informação;
    }


    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
