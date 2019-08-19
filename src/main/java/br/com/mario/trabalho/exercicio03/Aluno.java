/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.exercicio03;

import java.util.LinkedList;

/**
 *
 * @author mario
 */
public class Aluno {

    private String nome;
    private Integer numero;
    LinkedList<Double> notas;

    public Aluno(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
        this.notas = new LinkedList<>();
    }

    public void adicionarNota(Double nota) {
        this.notas.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LinkedList<Double> getNotas() {
        return notas;
    }

    public double getMedia() {
        return this.getNotas()
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + "\n"
                + "Número: " + numero + "\n"
                + "Notas: " + notas;
    }

}
