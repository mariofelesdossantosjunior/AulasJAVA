package br.com.mario.aula_09_05_2019;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class PilhaPalavras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PilhaEstatica pilha = new PilhaEstatica(30);

        System.out.println("Digite uma palavra:");
        char[] palavra = scanner.next().trim().toCharArray();
        char[] palavraInvertida = new char[palavra.length];

        for (char letra : palavra) {
            pilha.empilha(toLowerCase(letra));
        }

        for (int x = 0; x < palavra.length; x++) {
            palavraInvertida[x] = toLowerCase((char) pilha.desempilha());
        }

        boolean palindromo = Arrays.equals(palavra, palavraInvertida);

        System.out.println(Arrays.toString(palavraInvertida) + (palindromo ? " é um palindromo! " : " não é um palindromo!"));
    }
}
