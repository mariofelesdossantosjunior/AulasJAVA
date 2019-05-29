package br.com.mario.aula_02_05_2019;

import java.util.Arrays;

public class FilaCircularEstatica implements Fila<String> {

    private String[] dados;
    private int quantidade;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaCircularEstatica(int capacidade) {
        this.dados = new String[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.quantidade = 0;
        this.capacidade = capacidade;
    }

    @Override
    public void inserir(String item) throws FilaCheiaExption {
        if (estaCheia()) {
            throw new FilaCheiaExption(getClass().getName());
        } else {
            dados[fim] = item;
            fim = (++fim) % capacidade;
            quantidade++;
        }
    }

    @Override
    public String retirar() throws FilaVaziaExption {
        if (estaVazia()) {
            throw new FilaVaziaExption(getClass().getName());
        } else {
            String elemento = dados[inicio];
            inicio = (++inicio) % capacidade;
            quantidade--;
            return elemento;
        }
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    private boolean estaCheia() {
        return capacidade == quantidade;
    }

    @Override
    public int tamanho() {
        return capacidade;
    }

    @Override
    public String toString() {
        System.out.println("Inicio: " + inicio + " Fim: " + fim);
        return Arrays.toString(dados);
    }
}
