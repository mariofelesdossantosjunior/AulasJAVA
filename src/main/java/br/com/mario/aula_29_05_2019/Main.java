package br.com.mario.aula_29_05_2019;

import br.com.mario.aula_02_05_2019.FilaCheiaExption;
import br.com.mario.aula_02_05_2019.FilaVaziaExption;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FilaCheiaExption, FilaVaziaExption {


        FilaCircularEstatica aeroporto = new FilaCircularEstatica(5);
        Scanner leitor = new Scanner(System.in);

        int opcaoSelecionada;

        do {
            System.out.println("=============MENU====================");
            System.out.println("Presione (0) para Sair.");
            System.out.println("Presione (1) Listar o número de aviões aguardando na fila de decolagem;");
            System.out.println("Presione (2) Autorizar a decolagem do primeiro avião da fila;");
            System.out.println("Presione (3) Adicionar um avião à fila de espera;");
            System.out.println("Presione (4) Listar todos os aviões na fila de espera;");
            System.out.println("Presione (5) Listar as características do primeiro aviçao da fila\n");

            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:

                    if (aeroporto.estaVazia()) {
                        System.out.println("O aeroporto está vazio.");
                    } else {
                        System.out.println(" número de aviões aguardando na fila de decolagem é " + aeroporto.getQuantidade());
                    }

                    break;
                case 2:

                    if (aeroporto.estaVazia()) {
                        System.out.println("O aeroporto está vazio.");
                    } else {
                        Aviao aviao = (Aviao) aeroporto.retirar();
                        System.out.println("O avião autorizado a decolar foi :" + aviao.getNome() + " - Número: " + aviao.getNumero());
                    }

                    break;
                case 3:

                    if (aeroporto.estaCheia()) {
                        System.out.println("O aeroporto está cheio de aviões.");
                    } else {

                        System.out.println("Digite o nome do avião: ");
                        String nome = leitor.next();

                        System.out.println("Digite o número do avião: ");
                        int numero = leitor.nextInt();

                        Aviao aviao = new Aviao(nome, numero);
                        aeroporto.inserir(aviao);
                        System.out.println("Avião adicionado com sucesso!.");
                    }

                    break;
                case 4:

                    if (aeroporto.estaVazia()) {
                        System.out.println("O aeroporto está vazio.");
                    } else {

                        Object[] avioes = aeroporto.getDados();

                        for (int i = 0; i < avioes.length; i++) {
                            if (avioes[i] != null) {
                                Aviao aviao = (Aviao) avioes[i];

                                System.out.println("Avião: " + aviao.getNome() + " - Número: " + aviao.getNumero());
                            }
                        }
                    }

                    break;
                case 5:

                    if (aeroporto.estaVazia()) {
                        System.out.println("O aeroporto está vazio.");
                    } else {
                        Aviao primeiroAviao = (Aviao) aeroporto.topo();
                        System.out.println("O primeiro avião é : " + primeiroAviao.getNome() + " - Número: " + primeiroAviao.getNumero());
                    }
                    break;
                default:
                    if(opcaoSelecionada != 0) {
                        System.out.println("Opção não suportada. Tente Novamente");
                    }
                    break;
            }

        } while (opcaoSelecionada != 0);
    }
}
