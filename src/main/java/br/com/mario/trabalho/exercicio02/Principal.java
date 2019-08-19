/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.exercicio02;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro01 = new Livro("Java 8");
        biblioteca.cadastrarLivro(livro01);

        Pessoa pessoa01 = new Pessoa("Jose");
        Pessoa pessoa02 = new Pessoa("Pedro");
        Pessoa pessoa03 = new Pessoa("Maria");
        Pessoa pessoa04 = new Pessoa("João");
        Pessoa pessoa05 = new Pessoa("Rodrigo");

        biblioteca.requisitarLivro(livro01, pessoa01);
        biblioteca.requisitarLivro(livro01, pessoa02);
        biblioteca.requisitarLivro(livro01, pessoa03);

        biblioteca.disponibilizarLivro(livro01);

        biblioteca.requisitarLivro(livro01, pessoa04);
        biblioteca.requisitarLivro(livro01, pessoa05);

    }

}
