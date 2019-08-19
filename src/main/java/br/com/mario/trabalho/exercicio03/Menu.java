/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.exercicio03;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Menu {

    public static LinkedList<Aluno> alunos = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean aux = true;

        do {
            System.out.println("=============================================");
            System.out.println("====================MENU=====================");
            System.out.println("=============================================");
            System.out.println("(1) Para inserir aluno.");
            System.out.println("(2) Para excluir aluno.");
            System.out.println("(3) Para exibir os aluno e suas medias.");
            System.out.println("(0) Para sair");
            System.out.println("=============================================");

            int valorDigitado = scanner.nextInt();

            switch (valorDigitado) {
                case 0:
                    aux = false;
                    break;
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    excluirAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                default:
                    System.out.println("Número invalido!");
                    break;
            }
        } while (aux);
    }

    private static void excluirAluno() {
        System.out.println("=================================================");
        System.out.println("=================Excluir aluno===================");
        System.out.println("=================================================");
        System.out.print("Para excluir digite seu número:");

        int numero = scanner.nextInt();

        if (!alunos.isEmpty()) {
            boolean remocao = alunos.removeIf(aluno -> aluno.getNumero() == numero);
            System.out.println(remocao ? "Aluno removido com sucesso!" : "Aluno não encontrado!");
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void adicionarAluno() {
        System.out.println("=================================================");
        System.out.println("==============Cadastrar novo aluno===============");
        System.out.println("=================================================");

        System.out.print("Digite o nome:");
        String nome = scanner.next();
        System.out.print("Digite o número:");
        int numero = scanner.nextInt();

        Aluno aluno = new Aluno(nome, numero);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + "ª Nota: ");
            double nota = scanner.nextDouble();
            aluno.adicionarNota(nota);
        }

        alunos.add(aluno);
    }

    private static void listarAlunos() {
        System.out.println("=================================================");
        System.out.println("============Alunos / Notas / Média===============");
        System.out.println("=================================================");

        alunos.forEach(aluno -> {
            System.out.println(aluno);
            System.out.println("Media: " + aluno.getMedia());
            System.out.println("=============================================");
        });
    }

}
