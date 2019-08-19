package br.com.mario.trabalho.exercicio01;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.Scanner;

/**
 * @author mario
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Editor editor = new Editor();
        String texto = "";

        System.out.println("*********************************************");
        System.out.println("MENU");
        System.out.println("*********************************************");
        System.out.println("(@) Apagar tudo.");
        System.out.println("(#) Apagar o ultimo.");
        System.out.println("(x) Para sair.");
        System.out.println("*********************************************");
        System.out.println("Digite seu texto: ");

        do {

            System.out.print(editor.toString());
            texto = scanner.next();

            switch (texto) {
                case "#":
                    editor.pop();
                    break;
                case "@":
                    editor.limpar();
                    break;
                default:
                    editor.push(texto.charAt(0));
                    break;
            }

        } while (texto.charAt(0) != 'x');
    }

}
