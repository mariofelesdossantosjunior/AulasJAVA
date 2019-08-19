/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.exercicio02;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author mario
 */
public class Livro {

    private String nome;
    private boolean disponivel;
    private final Deque<Pessoa> fila;

    public Livro(String nome) {
        this.nome = nome;
        this.disponivel = true;
        this.fila = new ArrayDeque<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Deque<Pessoa> getFila() {
        return fila;
    }

    /**
     * Metodo responsavel por recuperar o primeiro da fila
     *
     * @return Primeira Pessoa da fila
     */
    public Pessoa getPrimeiroDafila() {
        return this.fila.getLast();
    }

    /**
     * Metodo responsavel por remover o primeiro da fila
     *
     * @return A primeira pessa da fila removida
     */
    public Pessoa removePrimeiroDaFila() {
        return this.fila.pollLast();
    }

    /**
     * Metodo responsavel por adicionar uma nova pessoa na fila
     *
     * @param pessoa
     */
    public void adicionarNaFila(Pessoa pessoa) {
        this.fila.push(pessoa);
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", disponibilidade=" + disponivel + ", fila=" + fila + '}';
    }

}
