package br.com.mario.aula_02_05_2019;

public interface Fila<T> {

    void inserir(T item) throws FilaVaziaExption, FilaCheiaExption;

    T retirar() throws FilaVaziaExption, FilaCheiaExption;

    boolean estaVazia();

    int tamanho();
}
