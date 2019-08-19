package br.com.mario.aula_29_05_2019;

import br.com.mario.aula_02_05_2019.Fila;
import br.com.mario.aula_02_05_2019.FilaCheiaExption;
import br.com.mario.aula_02_05_2019.FilaVaziaExption;

import java.util.Arrays;

public class FilaCircularEstatica implements Fila<Object> {

    private Object[] dados;
    private int quantidade;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaCircularEstatica(int capacidade) {
        this.dados = new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.quantidade = 0;
        this.capacidade = capacidade;
    }

    @Override
    public void inserir(Object item) throws FilaCheiaExption {
        if (estaCheia()) {
            throw new FilaCheiaExption(getClass().getName());
        } else {
            dados[fim] = item;
            fim = (++fim) % capacidade;
            quantidade++;
        }
    }

    @Override
    public Object retirar() throws FilaVaziaExption {
        if (estaVazia()) {
            throw new FilaVaziaExption(getClass().getName());
        } else {
            Object elemento = dados[inicio];
            dados[inicio] = null;
            inicio = (++inicio) % capacidade;
            quantidade--;
            return elemento;
        }
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    boolean estaCheia() {
        return capacidade == quantidade;
    }

    @Override
    public int tamanho() {
        return capacidade;
    }

    public Object[] getDados() {
        return dados;
    }

    public Object topo() throws FilaVaziaExption {
        if (estaVazia()) {
            throw new FilaVaziaExption(getClass().getName());
        } else {
            return dados[inicio];
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return Arrays.toString(dados);
    }
}
