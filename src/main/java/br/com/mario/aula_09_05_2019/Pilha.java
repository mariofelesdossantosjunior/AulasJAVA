package br.com.mario.aula_09_05_2019;

public interface Pilha {

    void empilha(Object o);

    Object desempilha();

    boolean estaCheia();

    boolean estaVazia();

    int tamanho();

    Object topo();
}
