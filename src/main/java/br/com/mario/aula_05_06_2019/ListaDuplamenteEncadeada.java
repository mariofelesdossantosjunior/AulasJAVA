package br.com.mario.aula_05_06_2019;

public class ListaDuplamenteEncadeada implements Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public ListaDuplamenteEncadeada() {
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
            this.inicio.setAnterior(novoNo);
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
            novoNo.setAnterior(fim);
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

            while (atual != null) {
                if (cont == posicao) {
                    if (atual.getAnterior() == null) {//Inicio da Lista
                        inserirInicio(e);
                    } else{//Meio da Lista
                        No novoNo = new No(e);
                        novoNo.setAnterior(atual.getAnterior());
                        novoNo.setProximo(atual);
                        atual.getAnterior().setProximo(novoNo);
                        atual.setAnterior(novoNo);
                    }
                    break;
                } else {
                    atual = atual.getProximo();
                    cont++;
                }
            }
        }
    }

    @Override
    public boolean retirar(Object e) {
        return false;
    }

    @Override
    public Object buscar(int posicao) {
        return null;
    }

    @Override
    public boolean existe(Object e) {
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


    public class No {
        private Object elemento;
        private No proximo;
        private No anterior;

        No(Object elemento) {
            this.elemento = elemento;
            this.proximo = null;
            this.anterior = null;
        }

        public Object getElemento() {
            return elemento;
        }

        public No getProximo() {
            return proximo;
        }

        void setProximo(No proximo) {
            this.proximo = proximo;
        }

        public No getAnterior() {
            return anterior;
        }

        void setAnterior(No anterior) {
            this.anterior = anterior;
        }
    }

}
