package br.com.mario.aula_11_06_2019;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Teste {

    public static void main(String[] args) {

        /**
         * Pilha
         */
        Stack pilha = new Stack();
        pilha.push("01");
        pilha.push("02");
        pilha.push("03");
        pilha.push("04");
        System.out.println(pilha);


        /**
         * Fila
         */
        Deque fila = new ArrayDeque();
        fila.add("01");
        fila.add("02");
        fila.add("03");
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);

    }
}
