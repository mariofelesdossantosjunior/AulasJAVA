package br.com.mario.aula_21_02_2018.exercicio01;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo01 = new Retangulo(10.0, 100.0);
        Retangulo retangulo02 = new Retangulo(20.0, 60.0);
        Retangulo retangulo03 = new Retangulo(30.0, 70.0);

        System.out.println(retangulo01.toString());
        System.out.println(retangulo01.perimetroRetangulo());

        System.out.println(retangulo02.toString());
        System.out.println(retangulo02.perimetroRetangulo());

        System.out.println(retangulo03.toString());
        System.out.println(retangulo03.perimetroRetangulo());
    }
}
