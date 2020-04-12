package Lista_Fila_Pilha;

public class Lista {


    private Node inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insereUltimo(int elemento) {
        Node nova = new Node();
        nova.setInformação(elemento);
        nova.setProximo(null);


        if (inicio == null) {
            inicio = nova;
        } else {
            Node aux;
            aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }

    }


    public Node removePrimeiro() {
        Node aux = inicio;
        inicio = inicio.getProximo();
        return aux;
    }

    public Node removeUltimo() {
        Node aux = inicio;
        Node anterior = aux;
        while (aux.getProximo() != null) {
            anterior = aux;
            aux = aux.getProximo();
        }
        anterior.setProximo(null);

        return aux;
    }

    public int topo() {
        Node aux = inicio;
        Node anterior = aux;
        while (aux.getProximo() != null) {
            anterior = aux;
            aux = aux.getProximo();
        }

        return aux.getInformação();
    }

    public int InserePrimeiro(int elemento) {
        Node nova = new Node();
        nova.setInformação(elemento);
        nova.setProximo(inicio);
        inicio = nova;
        return nova.getInformação();
    }


    public void imprime() {

        if (inicio != null) {
            Node aux = inicio;
            if (vazia()) {
                System.out.println("Vazia");
                return;
            }
            while (aux != null) {
                System.out.println(aux.getInformação());
                aux = aux.getProximo();
            }
        }

    }

    public boolean vazia() {
        return this.inicio.getProximo() == null;
    }


    public Node remover(Node no) {
        Node aux = inicio;
        inicio = no;
        return aux;
    }

    public int length() {
        if (inicio != null) {
            Node aux = inicio;
            int cont = 0;
            while (aux != null) {
                cont++;
                aux = aux.getProximo();
            }
            return cont;
        }
        return -1;
    }
}
