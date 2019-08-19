package br.com.mario.aula_30_05_2019;

import br.com.mario.aula_02_05_2019.FilaCheiaExption;
import br.com.mario.aula_02_05_2019.FilaVaziaExption;

public interface Fila {

    void inserir(Object item) throws FilaVaziaExption, FilaCheiaExption;

    Object retirar() throws FilaVaziaExption, FilaCheiaExption;

    boolean estaVazia();

    int tamanho();
}
