/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.exercicio02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mario
 */
public class Biblioteca {

    private final List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    /**
     * Metodo responsavel por adicionar um novo livro
     *
     * @param livro
     */
    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
    }

    /**
     * Metodo responsavel pela ação de requisitar o livro, caso livro esteja
     * disponivel o livro é emprestado, caso contrario a pessoal entra na fila
     * de emprestimo do livro
     *
     * @param livro
     * @param pessoa
     */
    public void requisitarLivro(Livro livro, Pessoa pessoa) {
        if (livro.isDisponivel()) {
            System.out.println("Livro disponível!");

            if (livro.getFila().isEmpty()) {//Sem fila
                System.out.println("Livro entregue a " + pessoa.getNome());
            } else {
                System.out.println("Livro entrega para " + livro.getPrimeiroDafila());
                livro.removePrimeiroDaFila();
            }
            livro.setDisponivel(false);

        } else {
            System.out.println("Livro indisponível!");
            System.out.println("A pessoa " + pessoa.getNome() + " entrou na fila de espera!");
            livro.adicionarNaFila(pessoa);
        }

        System.out.println("Fila Livro: " + livro.getFila().toString());
        System.out.println("\n=======================================\n");
    }

    /**
     * Metodo utilizado somente para disponibilizar o livro para emprestimo
     *
     * @param livro
     */
    public void disponibilizarLivro(Livro livro) {
        livro.setDisponivel(true);
    }

    @Override
    public String toString() {
        return "Blibioteca{" + "livros=" + livros + '}';
    }

}
