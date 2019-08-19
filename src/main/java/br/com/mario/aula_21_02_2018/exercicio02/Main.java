package br.com.mario.aula_21_02_2018.exercicio02;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado01 = new Quadrado(5.0);
        System.out.println("Primeiro Quadrado");
        System.out.println(quadrado01.getArea());
        System.out.println(quadrado01.getPerimetro() + "\n");

        Quadrado quadrado02 = new Quadrado(3.0);
        System.out.println("Segundo Quadrado");
        System.out.println(quadrado02.getArea());
        System.out.println(quadrado02.getPerimetro() + "\n");

        Quadrado quadrado03 = new Quadrado(22.0);
        System.out.println("Terceiro Quadrado");
        System.out.println(quadrado03.getArea());
        System.out.println(quadrado03.getPerimetro() + "\n");
    }
}
