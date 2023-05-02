package Teste;

import Listas.ListaIntAsc;

import java.util.Scanner;

public class MainExecute {


    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        ListaIntAsc lista = new ListaIntAsc();

        System.out.println("positivo insere | negativo encerra");
        int valor = S.nextInt();
        while (valor >= 0){
            lista.inserir(valor);
            lista.apresentar();
            System.out.println("positivo insere | negativo encerra");
            valor = S.nextInt();
        }

        S.close();
    }


}
