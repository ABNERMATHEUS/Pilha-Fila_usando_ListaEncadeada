package Lista_Fila_Pilha;

public class Main {
    public static void main(String[] args) {


        System.out.println("============ TESTE COM FILA =============");
        Fila fila = new Fila(4);
        fila.Insere(1);
        fila.Insere(3);
        fila.Insere(5);
        fila.Insere(7);
        fila.Remove();
        fila.Insere(10);
        fila.Remove();
        fila.Insere(12);
        fila.mostra_fila();
        System.out.println("==========================================");

        System.out.println("============ TESTE COM PILHA =============");
        Pilha pilha = new Pilha();

        pilha.empilha(1);
        pilha.empilha(10);
        pilha.empilha(100);
        pilha.desempilhar();
        pilha.empilha(100);
       // System.out.println(pilha.topo()); Retorna o topo que seria 100
        pilha.imprime();
        System.out.println("==========================================");






    }

}
