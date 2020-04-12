package Lista_Fila_Pilha;

public class Node {


    private int informação ;
    private Node proximo;

    public Node() {
        this.proximo = null;
    }

    public int getInformação() {
        return informação;
    }

    public void setInformação(int informação) {
        this.informação = informação;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
