package br.com.mario.aula_05_06_2019;

public class ListaEncadeada implements Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.quantidade = 0;
    }

    @Override
    public void inserirInicio(Object e) {
        if (estaVazia()) {
            No novoNo = new No(e);
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            No novoNo = new No(e);
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
        this.quantidade++;
    }

    @Override
    public void inserirFim(Object e) {
        if (estaVazia()) {
            No novoNo = new No(e);
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            No novoNo = new No(e);
            this.fim.setProximo(novoNo);
            this.fim = novoNo;
        }
        this.quantidade++;
    }

    @Override
    public void inserirMeio(Object e, int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            System.out.println("Posição inexistente!");
        } else if (estaVazia()) {
            inserirInicio(e);
        } else {
            int cont = 0;
            No atual = this.inicio;
            No ant = this.fim;
            while (atual != null) {
                if (cont == posicao) {
                    if (ant == null) {//Inicio da Lista
                        No novoNo = new No(e);
                        this.inicio = novoNo;
                        this.fim = novoNo;
                    } else {
                        No novoNo = new No(e);
                        novoNo.setProximo(atual);
                        ant.setProximo(novoNo);
                    }
                    this.quantidade++;
                    break;
                } else {
                    ant = atual;
                    atual = atual.getProximo();
                    cont++;
                }
            }
        }
    }

    @Override
    public boolean retirar(Object e) {
        No atual = this.inicio;
        No ant = null;

        while (atual != null) {
            if (atual.getElemento().equals(e)) {
                if (ant == null) {//O elemento está no inicio
                    this.inicio = atual.getProximo();
                    this.quantidade--;
                    return true;
                } else {
                    if (atual == fim) {//O elemento está no fim
                        this.fim = ant;
                        this.fim.setProximo(null);
                        this.quantidade--;
                    } else {//O elemento está no meio da lista
                        ant.setProximo(atual.getProximo());
                        atual.setProximo(null);
                        this.quantidade--;
                        return true;
                    }
                }
            }
            ant = atual;
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public Object buscar(int posicao) {
        No no = this.inicio;
        int cont = 0;
        while (no != null) {
            if (cont == posicao) {
                return no.getElemento();
            } else {
                no = no.getProximo();
                cont++;
            }
        }

        return null;
    }

    @Override
    public boolean existe(Object e) {

        No no = this.inicio;
        while (no != null) {
            if (no.getElemento().equals(e)) {
                return true;
            } else {
                no = no.getProximo();
            }
        }
        return false;
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    @Override
    public String toString() {
        StringBuilder lista = new StringBuilder();
        No no = this.inicio;

        while (no != null) {
            lista.append("[").append(no.getElemento()).append("],");
            no = no.getProximo();
        }

        return lista.toString();
    }
}
