package br.com.mario.aula_03_07_2019.exercicio02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> p = new Stack<>();
        Deque<String> f = new ArrayDeque<>();

        //Adicionando itens na fila
        f.add("A");
        f.add("B");
        f.add("C");
        f.add("D");
        f.add("E");

        int tamanhoFila = f.size();

        for (int i = 0; i < tamanhoFila; i++) {
            p.push(f.remove());
        }

        int tamanhoPilha = p.size();

        for (int i = 0; i < tamanhoPilha; i++) {
            f.add(p.pop());
        }

        System.out.println("Resultado: "+ f);

    }
}
