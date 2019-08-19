package br.com.mario.aula_05_06_2019;

public class MainDuplamente {

    public static void main(String[] args) {
        Lista lista = new ListaDuplamenteEncadeada();

        System.out.println(lista.toString());

        lista.inserirInicio("01");
        System.out.println(lista.toString());

        lista.inserirFim("02");
        System.out.println(lista.toString());


        lista.inserirMeio("04", 1);
        System.out.println(lista.toString());
    }
}
