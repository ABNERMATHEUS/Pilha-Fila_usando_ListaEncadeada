package Lista_Fila_Pilha;

public class Pilha {

    private Lista lista;

    public Pilha() {
        this.lista = new Lista();
    }

    public int topo() {
        return this.lista.topo();
    }

    public void empilha(int elemento) {
        lista.insereUltimo(elemento);
    }

    public int desempilhar() {
        if (lista.vazia()) {
            System.exit(0);
            return -1;
        }
        return lista.removeUltimo().getInformacao();
    }

    public void imprime() {
        lista.imprime();
    }

}
