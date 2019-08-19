package br.com.mario.aula_03_07_2019.exercicio01;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Resulta: " + eReverso());
    }

    private static boolean eReverso() {
        Stack<String> pilha01 = new Stack<>();
        Stack<String> pilha02 = new Stack<>();
        boolean aux = true;

        pilha01.push("A");
        pilha01.push("B");
        pilha01.push("B");
        pilha01.push("A");

        if (pilha01.size() % 2 == 0) {//Verifica se é par

            //Função para desempilhar e criar a segunda pilha
            int tamanho = pilha01.size();

            for (int i = 0; i < tamanho / 2; i++) {
                pilha02.push(pilha01.pop());
            }

            System.out.println(pilha01);
            System.out.println(pilha02);

            for (int i = 0; i < pilha02.size(); i++) {
                if (!pilha01.pop().equals(pilha02.pop())) {
                    aux = false;
                }
            }
        } else {
            System.out.println("Quantidade impar, impossivel de operar!");
        }

        return aux;
    }
}
