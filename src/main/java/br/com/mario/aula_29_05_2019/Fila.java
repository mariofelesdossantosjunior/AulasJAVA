package br.com.mario.aula_29_05_2019;

import br.com.mario.aula_02_05_2019.FilaCheiaExption;
import br.com.mario.aula_02_05_2019.FilaVaziaExption;

public interface Fila<T> {

    void inserir(T item) throws FilaVaziaExption, FilaCheiaExption;

    T retirar() throws FilaVaziaExption, FilaCheiaExption;

    boolean estaVazia();

    int tamanho();
}
