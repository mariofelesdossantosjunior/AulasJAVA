package br.com.mario.aula_05_06_2019;

public interface Lista {

    void inserirInicio(Object e);

    void inserirFim(Object e);

    void inserirMeio(Object e, int posicao);

    boolean retirar(Object e);

    Object buscar(int posicao);

    boolean existe(Object e);

    boolean estaVazia();


}
