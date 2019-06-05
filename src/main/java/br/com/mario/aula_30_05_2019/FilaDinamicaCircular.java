package br.com.mario.aula_30_05_2019;

import br.com.mario.aula_02_05_2019.Fila;
import br.com.mario.aula_02_05_2019.FilaVaziaExption;
import br.com.mario.aula_02_05_2019.No;

public class FilaDinamicaCircular implements Fila {

    private No<Object> inicio;
    private No<Object> fim;
    private int quantidade;


    public FilaDinamicaCircular() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    @Override
    public void inserir(Object item) {
        if (estaVazia()) {
            inicio = new No<>(item);
            fim = inicio;
            quantidade++;
        } else {
            No<Object> novo = new No<>(item);
            fim.setProximo(novo);
            fim = novo;
            quantidade++;

        }
    }

    @Override
    public Object retirar() throws FilaVaziaExption {
        if (estaVazia()) {
            throw new FilaVaziaExption(getClass().getName());
        } else {
            No no = inicio;
            inicio = inicio.getProximo();
            quantidade--;
            return no.getElemento();
        }
    }

    @Override
    public boolean estaVazia() {
        return inicio == null;
    }

    @Override
    public int tamanho() {
        return quantidade;
    }

    public Object topo(){
        return this.inicio;
    }

    @Override
    public String toString() {
        if (inicio != null && fim != null) {
            StringBuilder lista = new StringBuilder("Inicio: " + inicio.getElemento() + "Fim: " + fim.getElemento() + " --> ");

            No<Object> no = this.inicio;

            while (no != null) {
                lista.append("[").append(no.getElemento()).append("],");
                no = no.getProximo();
            }

            return lista.toString();
        } else {
            return "";
        }
    }
}
