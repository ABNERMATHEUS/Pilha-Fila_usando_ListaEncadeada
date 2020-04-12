package Lista_Fila_Pilha;


public class Fila {

    private Lista lista;

    public Fila( int max) {
        this.lista = new Lista();
    }

    public void Insere (int e){
          lista.InserePrimeiro(e);
    }

    public int Remove (){
        if(lista.vazia()){
            System.out.println("Vazia");
            return -1;
        }
        return lista.removeUltimo().getInformacao();
    }

    public void mostra_fila() {
        lista.imprime();
    }


}
