package br.com.mario.aula_09_05_2019;

import java.util.Arrays;

public class PilhaEstatica implements Pilha {

    private final Object[] dados;
    private int capacidade;
    private int quantidade;
    private int topo;

    public PilhaEstatica(int capacidade) {
        this.dados = new Object[capacidade];
        this.capacidade = capacidade;
        this.topo = -1;
        this.quantidade = 0;
    }

    @Override
    public void empilha(Object object) {
        if (estaCheia()) {
            throw new UnsupportedOperationException("Pilha cheia!");
        } else {
            topo++;
            dados[topo] = object;
            quantidade++;
        }
    }

    @Override
    public Object desempilha() {
        if (estaVazia()) {
            throw new UnsupportedOperationException("Pilha vazia!");
        } else {
            Object dado = dados[topo];
            dados[topo] = null;
            quantidade--;
            topo--;
            return dado;
        }
    }

    @Override
    public boolean estaCheia() {
        return quantidade == capacidade;
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    @Override
    public int tamanho() {
        return capacidade;
    }

    @Override
    public Object topo() {
        return dados[topo];
    }

    public Object[] getDados() {
        return dados;
    }

    @Override
    public String toString() {
        return Arrays.toString(dados);
    }
}
