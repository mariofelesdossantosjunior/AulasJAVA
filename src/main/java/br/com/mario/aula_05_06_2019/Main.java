package br.com.mario.aula_05_06_2019;

public class Main {

    public static void main(String[] args) {
        Lista lista = new ListaEncadeada();

        System.out.println(lista);
        lista.inserirInicio("01");

        System.out.println(lista);
        lista.inserirInicio("02");

        System.out.println(lista);
        lista.inserirFim("03");

        System.out.println(lista);
        lista.inserirMeio("04", 1);

        System.out.println(lista.buscar(3));

        System.out.println(lista);
        lista.retirar("01");

        System.out.println(lista);
        System.out.println(lista.existe("01"));

        System.out.println(lista.buscar(3));
    }
}
