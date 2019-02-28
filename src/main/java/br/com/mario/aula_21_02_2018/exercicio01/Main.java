package br.com.mario.aula_21_02_2018.exercicio01;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo01 = new Retangulo(10.0, 100.0);
        Retangulo retangulo02 = new Retangulo(20.0, 60.0);
        Retangulo retangulo03 = new Retangulo(30.0, 70.0);

        System.out.println("Primeiro Retangulo");
        System.out.println(retangulo01.toString());
        System.out.println(retangulo01.getArea());
        System.out.println(retangulo01.getPerimetro());

        System.out.println("Segundo Retangulo");
        System.out.println(retangulo02.toString());
        System.out.println(retangulo02.getArea());
        System.out.println(retangulo02.getPerimetro());

        System.out.println("Terceiro Retangulo");
        System.out.println(retangulo03.toString());
        System.out.println(retangulo03.getArea());
        System.out.println(retangulo03.getPerimetro());
    }
}
