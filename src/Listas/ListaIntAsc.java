package Listas;

public class ListaIntAsc {
    private class NO{
        int dado;
        NO prox;
    }

    private NO lista = null;

    public void inserir(int elem){
        NO novo = new NO();
        novo.dado = elem;
        if (lista == null){
            novo.prox = null;
            lista = novo;
        } else{
            if (novo.dado < lista.dado){
                novo.prox = lista;
                lista = novo;
            }
            else {
                NO aux = lista;
                boolean achou  = false;
                while (aux.prox!=null && !achou){
                    if (aux.prox.dado < novo.dado)
                        aux = aux.prox;
                    else
                        achou = true;
                }
                novo.prox = aux.prox;
                aux.prox = novo;
            }
        }
    }

    public void apresentar(){
        NO aux = lista;
        System.out.println("\n ***** Lista *****");
        while (aux!=null){
            System.out.println(aux.dado);
            aux = aux.prox;
        }
    }
}
