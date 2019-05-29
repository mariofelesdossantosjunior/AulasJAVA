package br.com.mario.aula_02_05_2019;

public class FilaDinamica implements Fila<String> {

    private No<String> inicio;
    private No<String> fim;
    private int quantidade;


    public FilaDinamica() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    @Override
    public void inserir(String item) {
        if (estaVazia()) {
            inicio = new No<>(item);
            fim = inicio;
            quantidade++;
        } else {
            No<String> novo = new No<>(item);
            fim.setProximo(novo);
            fim = novo;
            quantidade++;

        }
    }

    @Override
    public String retirar() throws FilaVaziaExption {
        if (estaVazia()) {
            throw new FilaVaziaExption(getClass().getName());
        } else {
            No no = inicio;
            inicio = inicio.getProximo();
            quantidade--;
            return (String) no.getElemento();
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

    @Override
    public String toString() {
        if (inicio != null && fim != null) {
            StringBuilder lista = new StringBuilder("Inicio: " + inicio.getElemento() + "Fim: " + fim.getElemento() + " --> ");

            No<String> no = this.inicio;

            while (no != null) {
                lista.append("[").append(no.getElemento()).append("],");
                no = no.getProximo();
            }

            return lista.toString();
        }else{
            return "";
        }
    }
}
