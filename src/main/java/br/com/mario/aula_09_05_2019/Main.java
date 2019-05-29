package br.com.mario.aula_09_05_2019;

public class Main {

    public static void main(String[] args) {

        PilhaEstatica pilha = new PilhaEstatica(10);
        pilha.empilha(5);
        pilha.empilha(4);
        pilha.empilha(3);
        pilha.empilha(2);
        pilha.empilha(1);
        System.out.println("Topo: " + pilha.topo());
        pilha.desempilha();
        pilha.desempilha();
        System.out.println("Topo: " + pilha.topo());

        System.out.println(pilha);


    }
}
